import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class JuniorSubjectsServiceService {
  BaseUrl = 'http://localhost:8080'
  //saving Stream to stream table in database
  submittingJuniorSubjects(value: any) {
    console.log(value)
    return this.http.post(this.BaseUrl + '/junior/save', value);
  }

  constructor(private http: HttpClient) { }
}
