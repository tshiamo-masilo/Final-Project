import { NgModule } from "@angular/core";

import { BrowserModule } from "@angular/platform-browser";
import { appRoutingModule } from "./app.routing";



import { MatToolbarModule } from "@angular/material/toolbar";
import { AppComponent } from "./app.component";

import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { MdbCollapseModule } from "mdb-angular-ui-kit/collapse";





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

import { HTTP_INTERCEPTORS } from "@angular/common/http";
import { TokenInterceptor } from "./user/token.interceptor";



@NgModule({



  declarations: [
    AppComponent,
    ApplicationComponent,
    HomeComponent,
    AboutComponent,
    ContactComponent,
    AccountComponent,
    ApplicationComponent,
    SchoolComponent,

    SignupComponent,
    LoginComponent,
   

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
  providers:[
    {
      provide:HTTP_INTERCEPTORS,
      useClass:TokenInterceptor,
      multi:true
    }
  ]
})
export class AppModule {}


