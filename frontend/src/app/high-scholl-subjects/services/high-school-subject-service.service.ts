import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HighSchoolSubjectServiceService {
  BaseUrl = 'http://localhost:8080'
  //saving Stream to stream table in database
  submittingHighSchoolSubjects(value: any) {
    return this.http.post(this.BaseUrl + '/hsubjects/save', value);
  }

  constructor(private http: HttpClient) { }
}
