import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'environments/environment';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  private api: string = environment.apiUrl;

  constructor(private http:HttpClient) { }

  public onLogin(logins: any): Observable<any>{
      return this.http.post<any>(`${this.api}/login`, logins);
    }

  // public  userLogin(logins :any): Observable<any> {
  //     return this.http.get<any>(`${this.api}/login`+ 'login');
  //   }

 
}