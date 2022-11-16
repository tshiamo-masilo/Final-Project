<<<<<<< HEAD
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
=======
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { UserService } from '../services/user.service';
>>>>>>> 16cd37d4f76e412aec94c726ea618a1905a32b1d

@Component({
  selector: "app-login",
  templateUrl: "./login.component.html",
  styleUrls: ["./login.component.css"],
})
export class LoginComponent implements OnInit {
  public loginForm!: FormGroup;
  submitted: boolean = true;

<<<<<<< HEAD
  constructor(
    private formBuilder: FormBuilder,
    private loginApi: LoginService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.loginForm = this.formBuilder.group({
      username: new FormControl("", Validators.required),
      password: new FormControl("", Validators.required),
=======
  form: FormGroup = new FormGroup({});

  constructor(private userService: UserService, private formBuilder: FormBuilder, private router: Router) { }

  ngOnInit(): void {
    this.buildForm();
  }

  buildForm() {
    this.form = this.formBuilder.group({
      username: ['', Validators.required],
      password: ['', Validators.required]
    })
  }

  login() {
    this.userService.login(this.form.value).subscribe(data => {
      sessionStorage.setItem('token', data.token);
      this.router.navigateByUrl('/home');

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
