import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HighSchoolSubjectServiceService {
  BaseUrl = 'http://localhost:8080'
  //saving Stream to stream table in database
  submittingHighSchoolSubjects(value: any) {
    console.log(value)
    return this.http.post(this.BaseUrl + '/high/save', value);
  }

  constructor(private http: HttpClient) { }
}
