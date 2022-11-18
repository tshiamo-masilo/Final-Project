import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { environment } from "environments/environment";
import { Observable } from "rxjs";
import { UsersInfor } from "../models/users.model";

@Injectable({
  providedIn: "root",
})
export class SignupService {
  private api: string = environment.apiUrl;

  constructor(private http: HttpClient) {}

 
  public addUser(user: UsersInfor): Observable<UsersInfor[]> {
    return this.http.post<UsersInfor[]>(`${this.api}/user/`, user);
  }
}
