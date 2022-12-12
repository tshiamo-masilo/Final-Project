import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DetailsServiceService {

  public getStudentDetails(id:any){
    this.http.get(`https://localhost:8080/student/getStudentDetails/${id}`)
  }
  public getStudent(id:any){
    
  }
  constructor(private http:HttpClient) { }
}
