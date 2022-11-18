import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SchoolsServiceService {
  BaseUrl = 'http://localhost:8080'
  savingSchool(values:any){
   return this.http.post(this.BaseUrl+'/school/save', values)
  }
  get(id:any){
   return this.http.get(this.BaseUrl+`/school/get/${id}`)
  }
   constructor(private http:HttpClient) { }
 }
