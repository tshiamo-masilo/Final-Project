import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import {FormGroup, FormBuilder} from '@angular/forms';
import { Router } from '@angular/router';
import { SignupService } from '../signup.service';
import { UsersInfor } from '../users.model';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  users !: UsersInfor[];
  
   
  public signupForm !: FormGroup;

  constructor( private formbuilder : FormBuilder, private router :Router, private apiSignUp :SignupService){}
  
  ngOnInit(): void {
    this.signupForm = this.formbuilder.group({
      name:[''],
      surname:[''],
      email:[''],
      username:[''],
      password:[''],
      confirmPassword:['']
    })
  }

  signUp(){
    console.log(this.signupForm);
    
    if (this.signupForm.invalid) return;

    this.apiSignUp.addUser(this.signupForm.value).subscribe((res: any) => {
      console.log(res);
    });
  }
}
