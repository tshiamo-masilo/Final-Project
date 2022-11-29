import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { environment } from "environments/environment";
import { Observable } from "rxjs";
import { TokenResponse } from "../model";
import { UsersInfor } from "../models/users.model";

@Injectable({
  providedIn: "root",
})
export class SignupService {

  // url:string = "http:localhost:8080"

  constructor(private http: HttpClient) {}

 
  public addUser(user: UsersInfor): Observable<any>{
    console.log(user);
    return this.http.post<any>(`http://localhost:8080/user/addUser`, user);
    
  }
  
  // public addUser(user: UsersInfor): Observable<any>{
  //   console.log(user);
  //   return this.http.post<any>(`url/user/api`, user);
  // }

 }

