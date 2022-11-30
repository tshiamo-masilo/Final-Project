import { HttpClient } from "@angular/common/http";
import { Token } from "@angular/compiler";
import { Component, OnInit } from "@angular/core";
import {
  FormBuilder,
  FormControl,
  FormGroup,
  Validators,
} from "@angular/forms";
import { environment } from "environments/environment";
import { LoginService } from "./user/services/login.service";
import { TokenService } from "./user/services/token.service";

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.css"],
})
export class AppComponent implements OnInit {
  [x: string]: any;
  title = "Project-FrontEnd";

  private api: string = environment.apiUrl;

  constructor(
    public http: HttpClient,
    private token: TokenService,
    private formBuilder: FormBuilder
  ) {}
  ngOnInit(): void {}
  public ping() {
    this.http.get(`${this.api}/login`).subscribe(
      (data) => console.log(data),
      (err) => console.log(err)
    );
  }

  isLogin() {
    console.log(this.token.getToken());
    return this.token.getToken();
  }

  onlogout(){
    sessionStorage.clear();
    location.reload();
  }
    


}
