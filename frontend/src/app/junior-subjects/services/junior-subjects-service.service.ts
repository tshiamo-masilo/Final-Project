import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class JuniorSubjectsServiceService {
  BaseUrl = 'http://localhost:8080'
  //saving Stream to stream table in database
  submittingJuniorSubjects(value: any) {
    return this.http.post(this.BaseUrl + '/junior/school/subjectssubjects/save', value);
  }

  constructor(private http: HttpClient) { }
}
