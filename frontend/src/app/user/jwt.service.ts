import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'environments/environment';

@Injectable({
  providedIn: 'root'
})
export class JWTService {
  private api: string = environment.BaseUrl;

  constructor(private http: HttpClient) { }

  public generateToken(request:any){
    return this.http.post(`${this.api}/login`,request,{responseType:'test' as 'json'});
  }
}
