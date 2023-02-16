import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StreamServiceService {
  BaseUrl = 'http://localhost:8080'

  //saving Stream to stream table in database
  submittingStreams(value: any) {
    console.log(value);
    return this.http.post(this.BaseUrl + '/stream/save', value);
  }
  //getting subjects from subjectrs table in database
  gettingSubjects() {
    return this.http.get(this.BaseUrl + '/high/getAll');
  }
  constructor(private http: HttpClient) { }
}
