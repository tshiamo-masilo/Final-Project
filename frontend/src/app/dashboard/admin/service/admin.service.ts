import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
//import {httpClient} from 

@Injectable({
  providedIn: 'root'
})


export class AdminService {
    environments = {
    production: false,
    apiUrl: "https://localhost:4400/api",
    defaultPassword:"p@ssword1"
  }
  apiUrl: String = "https://localhost:4400/api";
//variable
    //function to get all students

    //json/java script array of data

    //mapp the data in the front end

    constructor(private http: HttpClient,) { }


    getAllApplications(): Observable<any>  {
      return this.http.get(`${this.apiUrl}/applications/all`);
    }
  
    getApplicationById(id: any): Observable<any>  {
      return this.http.get(`${this.apiUrl}/application/id?=${id}`);
    }
  
    acceptLearnerById(id:any , body: any): Observable<any>  {
      return this.http.post(`${this.apiUrl}/application/post/id?=${id}`, body);
    }
  
  
    deleteApplicationById(id: any, ):Observable<any> {
      return this.http.delete(`${this.apiUrl}/application/delete/id?=${id}`);
    }

    deleteAllApllications():Observable<any>{
      return this.http.delete(`${this.apiUrl}/application/deleteAll`)
    }

    /*
      students: any[]
    =======================================================================
      <h2>Angular Service Example</h2>
<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Branch</th>
            <th>DOB</th>
            <th>Gender</th>
        </tr>
    </thead>
    <tbody>
        <tr *ngFor='let student of students'>
            <td>{{student.ID}}</td>
            <td>{{student.FirstName}}</td>
            <td>{{student.LastName}}</td>
            <td>{{student.Branch}}</td>
            <td>{{student.DOB}}</td>
            <td>{{student.Gender}}</td>
        </tr>
    </tbody>
</table>
    

*/
  
   
}