import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'environments/environment';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  private api: string = environment.BaseUrl;

  constructor(private http:HttpClient) { }

  public onLogin(logins: LockInfo): Observable<LockInfo[]>{
      return this.http.post<LockInfo[]>(`${this.api}/login`, logins);
    }
}
