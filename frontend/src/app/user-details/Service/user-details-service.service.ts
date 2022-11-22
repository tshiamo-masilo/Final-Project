import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserDetailsServiceService {
  update(value: any) {
    return this.http.put("Http://localhost:8080/StudentApplication/update", value);
  }
  getall(){
    return this.http.get("Http://localhost:8080/StudentApplication/getAll")
  }

  constructor(private http: HttpClient) {
  }
}
