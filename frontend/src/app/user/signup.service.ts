import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { environment } from "environments/environment";
import { Observable } from "rxjs";
import { UsersInfor } from "./users.model";

@Injectable({
  providedIn: "root",
})
export class SignupService {
  private api: string = environment.BaseUrl;

  constructor(private http: HttpClient) {}

  public getUsers(): Observable<UsersInfor[]> {
    return this.http.get<UsersInfor[]>(`${this.api}/user/all`);
  }
  public addUser(user: UsersInfor): Observable<UsersInfor[]> {
    return this.http.post<UsersInfor[]>(`${this.api}/user/`, user);
  }
}
