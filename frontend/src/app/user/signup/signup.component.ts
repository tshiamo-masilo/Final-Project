import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import {FormGroup, FormBuilder, FormControl, Validators} from '@angular/forms';
import { Router } from '@angular/router';
import { SignupService } from '../services/signup.service';
import { UsersInfor } from '../models/users.model';
import ValidateForm from '../Validation/validation';

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
       this.signupForm.reset();
       this.router.navigate(['signIn']);
    });
  }
  onSignUp(){
    if(this.signupForm.valid){
      alert("You have successfuly Registered As A School Log User!")
    }else{
      ValidateForm.validateAllformfields(this.signupForm);
      alert("Something went wrong please !!")
    }
  }
}
