import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SchoolsServiceService {
<<<<<<< HEAD
 
  constructor() { }
=======
 savingSchool(values:any){
  return this.http.post('http://localhost:8080/school/save', values)
 }
 get(id:any){
  return this.http.get(`http://localhost:8080/school/get/${id}`)
 }
  constructor(private http:HttpClient) { }
>>>>>>> 69a29dee79dfbb0972d442b12270179118efa477
}
