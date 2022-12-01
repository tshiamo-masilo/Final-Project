import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import {FormGroup, FormBuilder, FormControl, Validators} from '@angular/forms';
import { Router } from '@angular/router';
import { SignupService } from '../services/signup.service';


@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {


  
   
  public signupForm !: FormGroup;
  isSuccessful = false;
  isSignUpFailed = false;

  constructor( private formbuilder : FormBuilder, private router :Router, private apiSignUp :SignupService){}
  
  ngOnInit(): void {
    this.signupForm = this.formbuilder.group({
      name:new FormControl('', Validators.required),
      surname:new FormControl('', Validators.required),
      email: new FormControl('', Validators.compose([
        Validators.required,
        Validators.pattern('^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$')
      ])),
      username:new FormControl('', Validators.required),
      password:new FormControl('', Validators.required),
      confirmPassword:new FormControl('', Validators.required)
    })
  }

  signUp(){
    console.log(this.signupForm);
    
    if (this.signupForm.invalid) return;

    this.apiSignUp.addUser(this.signupForm.value).subscribe((res: any) => {
       this.signupForm = res;
       console.log(res);
       this.isSuccessful=true;
       this.isSignUpFailed = false;
       this.router.navigate(['signIn']);
    }, error=>{
      this.isSignUpFailed = true
    });
  }
}
