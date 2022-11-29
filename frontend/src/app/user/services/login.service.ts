import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'environments/environment';
import { Observable } from 'rxjs';
import { TokenResponse } from '../model';
import { LoginInfo } from '../models/login.model';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  private api: string = environment.apiUrl;

  constructor(private http:HttpClient) { }

  public onLogin(logins: LoginInfo): Observable<TokenResponse>{
      return this.http.post<TokenResponse>(`${this.api}/login`, logins);
    }

  // public  userLogin(logins :any): Observable<any> {
  //     return this.http.get<any>(`${this.api}/login`+ 'login');
  //   }

 
}