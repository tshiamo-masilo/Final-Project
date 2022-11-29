import { Component, OnInit } from "@angular/core";
import { FormBuilder, FormControl, FormGroup, Validators } from "@angular/forms";
import { Router } from "@angular/router";
import { LoginService } from "../services/login.service";
import { TokenService } from "../services/token.service";
import ValidateForm from "../Validation/validation";

  @Component ({
  selector: "app-login",
  templateUrl: "./login.component.html",
  styleUrls: ["./login.component.css"],
  })
export class LoginComponent implements OnInit {
  public loginForm!: FormGroup;
  


  constructor(
    private formBuilder: FormBuilder,
    private loginApi: LoginService,
    private router: Router,
    private tokenService: TokenService
  ) {}

  ngOnInit(): void {
    this.loginForm = this.formBuilder.group({
      username: new FormControl("", Validators.required),
      password: new FormControl("", Validators.required),
    })
    }

  login() {
    return this.loginApi.onLogin(this.loginForm.value).subscribe((res:any)=> {
      console.log(res);
      this.tokenService.setToken(res.token);
      this.loginForm.reset();
      this.router.navigate(['home']);
    })
  }
  
  
  onSubmit() {
    if (this.loginForm.valid) {
    } else {
      ValidateForm.validateAllformfields(this.loginForm);
    }
  }
}
