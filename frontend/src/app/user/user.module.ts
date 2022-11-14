import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './login/login.component';

import { RouterModule } from '@angular/router';
import { ForgotComponent } from './forgot/forgot.component';



@NgModule({
  declarations: [
    
    ForgotComponent,
  ],
  imports: [
    CommonModule,
    RouterModule
  ]
})
export class UserModule { }
