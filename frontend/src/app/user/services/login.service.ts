import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'environments/environment';
import { Observable } from 'rxjs';
import { LoginInfo } from '../models/login.model';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  private api: string = environment.apiUrl;

  constructor(private http:HttpClient) { }

  public onLogin(logins: LoginInfo): Observable<any>{
      return this.http.post(`${this.api}/login`, logins);
    }
}