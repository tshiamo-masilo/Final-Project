import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { UserService } from '../services/user.service';
import { contants } from 'src/app/global-functions/contants';
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  //initialize login form and validation
  loginForm: FormGroup = new FormGroup({
    Email: new FormControl('', [Validators.required, Validators.email]),
    PassWord: new FormControl('', Validators.required)
  });

  serverErrorMessage: any = null;

  //constructor parameter
  constructor(private userService: UserService, private router: Router, private toaster: ToastrService) { }

  //login function 
  login() {

    this.loginForm.markAllAsTouched();

    if (this.loginForm.invalid) {
      return;
    }

    // making a backend call
    this.userService
      .authenticate(this.loginForm.value)
      .subscribe((response: any | undefined) => {
        // save the token
        sessionStorage.setItem(contants.token, response?.token);
        sessionStorage.setItem(contants.username, `${response?.name} ${response?.surname}`);
        sessionStorage.setItem(contants.role, response?.role);

        // route to the master layout
        //route to application form or where user was previously
        /*implementation here
        ->
        ->
        ===============================================================================
        */

        this.router.navigate(['adress to be allocated ']);

      },
        error => {
          this.loginForm.controls['Email'].setErrors({ isUserNameOrPasswordIncorrect: true });
          this.loginForm.controls['Password'].setErrors({ isUserNameOrPasswordIncorrect: true });
          this.loginForm.updateValueAndValidity();
          this.serverErrorMessage = error?.message;
        });
  }

  ngOnInit(): void {
  }

}
/*

    Password: new FormControl('', Validators.required),
  });

  serverErrorMessage: any = null;

  constructor(private userService: UserService, private router: Router, private toastr: ToastrService) {}

  ngOnInit(): void {}

  login() {
    // display the error message
    this.loginForm.markAllAsTouched();

    // stop the code running
    if (this.loginForm.invalid) {
      return;
    }

    // making a backend call
    this.userService
      .authenticate(this.loginForm.value)
      .subscribe((response: any | undefined) => {
        // save the token
        sessionStorage.setItem(contants.token, response?.token);
        sessionStorage.setItem(contants.username, `${response?.name} ${response?.surname}`);
        sessionStorage.setItem(contants.role, response?.role);

        // route to the master layout
        this.router.navigate(['/dashboard']);

       },
       error => {
        this.loginForm.controls['Email'].setErrors({ isUserNameOrPasswordIncorrect: true });
        this.loginForm.controls['Password'].setErrors({ isUserNameOrPasswordIncorrect: true });
        this.loginForm.updateValueAndValidity();
        this.serverErrorMessage = error?.message;
       });
  }

  openSocialMediaOnNewTab(url: string){
    window.open(url, "_blank");
  }

}
*/