import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'environments/environment';
import { Observable } from 'rxjs';
import { LoginCredentials } from '../model';
import { TokenResponse } from '../model/token-response';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  login(loginCredentials: LoginCredentials): Observable<TokenResponse> {
    return this.http.post<TokenResponse>(`${environment.apiUrl}/login`, loginCredentials);
  }
}
