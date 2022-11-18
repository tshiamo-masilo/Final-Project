import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StreamServiceService {
  //saving Stream to stream table in database
  submittingStreams(value: any) {
    return this.http.post('http://localhost:8080/streams/save', value);
  }
  constructor(private http: HttpClient) { }
}
