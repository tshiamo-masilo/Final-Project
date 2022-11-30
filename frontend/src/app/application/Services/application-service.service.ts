import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ApplicationServiceService {

  getStreams(){
    return this.http.get('hppp://localhost/streams/getAll');
  }
  submit(value:any):any{
    console.log(value);
    this.http.post('hppp://localhost/application/save', value);
  }
  constructor(private http:HttpClient) { }
}
