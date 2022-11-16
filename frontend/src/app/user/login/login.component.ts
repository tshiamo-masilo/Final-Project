import { HttpClient } from "@angular/common/http";
import { Component, OnInit } from "@angular/core";
import {
  FormBuilder,
  FormControl,
  FormGroup,
  Validators,
} from "@angular/forms";
import { Router } from "@angular/router";
import { LoginService } from "../login.service";
import ValidateForm from "../Validation/validation";

@Component({
  selector: "app-login",
  templateUrl: "./login.component.html",
  styleUrls: ["./login.component.css"],
})
export class LoginComponent implements OnInit {
  public loginForm!: FormGroup;
  submitted: boolean = true;

  constructor(
    private formBuilder: FormBuilder,
    private loginApi: LoginService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.loginForm = this.formBuilder.group({
      username: new FormControl("", Validators.required),
      password: new FormControl("", Validators.required),
    });
  }
  login() {

    this.loginApi.onLogin(this.loginForm.value).subscribe((res:any)=>{
      alert("Successfully login!");
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
