import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SubjectServiceService {

 //saving Requirements to requirements table in  database
 submitingSubject(values: any) {
  console.log(values)
  return this.http.post('http://localhost:8080/subject/save', values);
 
}
  constructor(private http:HttpClient) { }
}

