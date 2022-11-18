import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StreamServiceService {
  BaseUrl = 'http://localhost:8080'
  //saving Stream to stream table in database
  submittingStreams(value: any) {
    return this.http.post(this.BaseUrl+'/stream/save', value);
  }
  constructor(private http: HttpClient) { }
}
