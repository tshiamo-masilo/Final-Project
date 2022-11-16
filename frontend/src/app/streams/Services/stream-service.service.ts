import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StreamServiceService {


  //saving Streams to stream table in  database
  submittingStreams(value: any) {
    return this.http.post('http://localhost:8080/streams/save', value);
  }
  //saving Requirements to requirements table in  database
  submittingRequirements(values: any) {
    console.log(values)
    return this.http.post('http://localhost:8080/requirements/save', values);
   
  }
  constructor(private http: HttpClient) { }
}
