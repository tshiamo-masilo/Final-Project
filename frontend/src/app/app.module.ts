import { NgModule } from "@angular/core";

import { BrowserModule } from "@angular/platform-browser";
import { appRoutingModule } from "./app.routing";



import { MatToolbarModule } from "@angular/material/toolbar";
import { AppComponent } from "./app.component";

import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { MdbCollapseModule } from "mdb-angular-ui-kit/collapse";

<<<<<<< HEAD



import { HomeComponent } from "./home/home.component";
import { AboutComponent } from "./about/about.component";
import { ContactComponent } from "./contact/contact.component";


import { AccountComponent } from "./account/account.component";
import { ApplicationComponent } from "./application/application.component";
import { SchoolComponent } from "./school/school.component";
import { SignupComponent } from "./user/signup";
import { ReactiveFormsModule } from "@angular/forms";
import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from "./user/login";




@NgModule({


=======
// import { LoginComponent } from './user/login/login.component';
import { SignupComponent } from './user/signup/signup.component';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';
import { UserModule } from './user/user.module';

@NgModule({
>>>>>>> 16cd37d4f76e412aec94c726ea618a1905a32b1d
  declarations: [
    AppComponent,
    ApplicationComponent,
    HomeComponent,
    AboutComponent,
    ContactComponent,
    AccountComponent,
    ApplicationComponent,
    SchoolComponent,
<<<<<<< HEAD
    SignupComponent,
    LoginComponent
=======
  ],
  imports: [
    BrowserModule,
    MatToolbarModule,
    BrowserAnimationsModule,
    UserModule,
    MdbCollapseModule,
    appRoutingModule,
    HttpClientModule,
    ReactiveFormsModule
>>>>>>> 16cd37d4f76e412aec94c726ea618a1905a32b1d
  ],
  imports: [
    BrowserModule,
    MatToolbarModule,
    BrowserAnimationsModule,
    MdbCollapseModule,
    ReactiveFormsModule,
    HttpClientModule,
    
    appRoutingModule,
   
   
    ],
  bootstrap: [AppComponent],
})
export class AppModule {}

<<<<<<< HEAD
=======
export class AppModule { }
>>>>>>> 16cd37d4f76e412aec94c726ea618a1905a32b1d
