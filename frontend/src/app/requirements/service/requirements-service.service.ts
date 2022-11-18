import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RequirementsServiceService {

  //saving Requirements to requirements table in  database
  submittingRequirements(values: any) {
    console.log(values)
    return this.http.post('http://localhost:8080/requirements/save', values);
   
  }
  constructor(private http: HttpClient) { }
}
