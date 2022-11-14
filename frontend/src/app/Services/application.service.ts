import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ApplicationService {
update(value:any){
  return this.http.put("Http://localhost:8080/student/update",value);
}
 
  constructor(private http:HttpClient) {
   }
}
