import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SchoolsServiceService {
<<<<<<< HEAD

  constructor(private http: HttpClient) { }

  savingSchool(values: any) {
    return this.http.post('http://localhost:8080/school/save', values)
  }
  get(id: any) {
    return this.http.get(`http://localhost:8080/school/get/${id}`)
  }
=======
 savingSchool(values:any){
  return this.http.post('http://localhost:8080/school/save', values)
 }
 get(id:any){
  return this.http.get(`http://localhost:8080/school/get/${id}`)
 }
  constructor(private http:HttpClient) { }
>>>>>>> c7a88bc1827aed0a794608f53aa93a4269b9d588
}
