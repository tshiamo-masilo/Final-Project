import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RequirementsServicesService {
  BaseUrl = 'http://localhost:8080'
  //saving requirement to requirements table in database
  submittingRequirements(value: any) {
    return this.http.post(this.BaseUrl + '/requirements/save', value);
  }
  getStreams(){
    return this.http.get(this.BaseUrl + '/stream/getAll');    
  }
  getRequirementsSubjects(){
    return this.http.get(this.BaseUrl + '/junior/getAll');    
  }
  constructor(private http: HttpClient) { }
}
