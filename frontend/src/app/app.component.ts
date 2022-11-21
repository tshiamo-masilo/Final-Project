import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { environment } from 'environments/environment';
import { LoginService } from './user/services/login.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Project-FrontEnd';

  private api: string = environment.apiUrl;

  constructor(public http:HttpClient, private loginApi: LoginService){}
  ngOnInit(): void {
   
  }
  public ping(){
    this.http.get(`${this.api}/login`).subscribe(
      data => console.log(data),
      err => console.log(err)
    );
  };
  public login(){
    return this.loginApi;
  }

}
