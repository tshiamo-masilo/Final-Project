import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SubjectServiceService {
  BaseUrl = 'http://localhost:8080'

 //saving Requirements to requirements table in  database
 submitingSubject(values: any) {  
  return this.http.post(this.BaseUrl+'/subject/save', values);
 
}
  constructor(private http:HttpClient) { }
}

