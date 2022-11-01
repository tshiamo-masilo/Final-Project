import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'environments/environment';
//import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class SchoolService {

  constructor(private http:HttpClient) { }

  getAllSchool(){
    return this.http.get(`${environment.apiUrl}/schools`);
  }

  getSchool(id:any){
    return this.http.get(`${environment.apiUrl}/schools/id?=${id}`);
  }
}

//=======service documentation=========
//what will be needed: getASchool from DB
//add a school 
//remove a school
//get all schools
//get a pricture of the school
//etc...