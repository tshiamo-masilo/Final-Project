import { HttpEvent, HttpHandler, HttpInterceptor, HttpRequest } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { TokenService } from "./services/token.service";


@Injectable()
export class TokenInterceptor implements HttpInterceptor {
    constructor( public auth:TokenService){}
    intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
        this.auth.getFromSessionStorage();
        
        if (this.auth.getToken()) {
            request = request.clone({
                setHeaders:{
                    Authorization : `Bearer ${this.auth.getToken()}`
                }
            });
        }

        return next.handle(request);
    }
}