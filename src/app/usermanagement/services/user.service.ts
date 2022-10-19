import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable} from 'rxjs';
import { environment} from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class UserService {
 
  //get returns only data
  //post required a body to go along with the request
  //this service gets the users via api restful api requests 
  //made to add new users that just registred 
  //made to fetch users by id
  constructor(private http: HttpClient) { }

  authenticate(value:any): Observable<any>{
    return this.http.post(`${environment.apiUrl}/user/login`, value);
  }

  getAllUsers(): Observable<any> {
    return this.http.get(`${environment.apiUrl}/user`);
  }
  
  getUserById(id:any):Observable<any>{
    return this.http.get(`${environment.apiUrl}/user/${id}`);
  }

  addUser(path:string, body:any):Observable<any>{
    return this.http.post(`${environment.apiUrl}/user`, body);
  }

  updateUser(path:string, body:any){
    return this.http.put(`${environment.apiUrl}/user`, body);
  }

  getPageUsers(skip:number, take:number){
    return this.http.get(`${environment.apiUrl}/user?skip=${skip}&take=${take}`);
  }

  deleteUser(id: any) {
    return this.http.delete(`${environment.apiUrl}/user?id=${id}`);
  }
  //put for updating password
  //post for adding new data  
}
