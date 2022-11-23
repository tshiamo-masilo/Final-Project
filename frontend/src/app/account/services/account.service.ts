import { HttpClient } from '@angular/common/http';
import { ThisReceiver } from '@angular/compiler';
import { Injectable } from '@angular/core';
import { environment } from 'environments/environment';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AccountService {
  private apiserverUrl=environment.apiBaseUrl;
 
public getAccount():Observable<any>{
  return this.http.get<any>(`${this.apiserverUrl}/studentApplication/getAll`);
}
  updateDetails() {
    // var details: any = {
    //   "fullName": "lebo",
    //   "id": "9712269545548",
    //   "nationality": "South African",
    //   "homeLanguage": "IsiXhosa",
    //   "phone": "0785454512",
    //   "guardianPhone": "0785454215",
    //   "email": "guardian@gmail.com",
    //   "homeAddress": "2 middelvlei, ",
    //   "code": "2070",
    //   "guardianFullName": "Full Name"

    // }
    // return details;
  }
  constructor(private http:HttpClient) {}
  getStudentApplicationById(id:number){
    return this.http.get(`Http://localhost:8080/studentApplication/get/${id}`);
 }
 
}
