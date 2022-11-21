import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AccountService {
  url= "";

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
  getStudentApplicationById(){
    return this.http.get('Http://localhost:8080/studentApplication/getAll');
 }
 
}
