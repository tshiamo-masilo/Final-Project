import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RequirementsServiceService {
  BaseUrl = 'http://localhost:8080'
  //saving Requirements to requirements table in  database
  submittingRequirements(values: any) {
    return this.http.post(this.BaseUrl+'/requirements/save', values)   
  }
  //getting all tthe streams from the database
  getAllStreams(){
    return this.http.get(this.BaseUrl+'/stream/getAll');
  }
  constructor(private http: HttpClient) { }
}
