import { NgModule } from "@angular/core";

<<<<<<< HEAD
import { BrowserModule } from "@angular/platform-browser";
import { appRoutingModule } from "./app.routing";
=======
<<<<<<< HEAD
// import { UserModule } from './user/user.module';


import {MatToolbarModule} from '@angular/material/toolbar';
import {AppComponent } from './app.component';


import {BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MdbCollapseModule } from 'mdb-angular-ui-kit/collapse';
import { HttpClientModule } from '@angular/common/http';
=======
import { BrowserModule } from "@angular/platform-browser";
import { appRoutingModule } from "./app.routing";
>>>>>>> db9abb4a47de7be7c0cc363c5cf5ab39f622ccc7
>>>>>>> c7a88bc1827aed0a794608f53aa93a4269b9d588



import { MatToolbarModule } from "@angular/material/toolbar";
import { AppComponent } from "./app.component";

import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { MdbCollapseModule } from "mdb-angular-ui-kit/collapse";

<<<<<<< HEAD
=======
<<<<<<< HEAD
// import { LoginComponent } from './user/login/login.component';
import { SignupComponent } from './user/signup/signup.component';
import { StreamsComponent } from './streams/streams.component';
import { ReactiveFormsModule } from '@angular/forms';
import { SubjectsComponent } from './subjects/subjects.component';
import { RegisterComponent } from './register/register.component';
import { RequirementsComponent } from './requirements/requirements.component';
=======
>>>>>>> db9abb4a47de7be7c0cc363c5cf5ab39f622ccc7
>>>>>>> c7a88bc1827aed0a794608f53aa93a4269b9d588




import { HomeComponent } from "./home/home.component";
import { AboutComponent } from "./about/about.component";
import { ContactComponent } from "./contact/contact.component";

// import { LoginComponent } from './user/login/login.component';
import { SignupComponent } from './user/signup/signup.component';
import { StreamsComponent } from './streams/streams.component';
import { ReactiveFormsModule } from '@angular/forms';
import { SubjectsComponent } from './subjects/subjects.component';
import { RegisterComponent } from './register/register.component';
import { RequirementsComponent } from './requirements/requirements.component';
import { AccountComponent } from "./account/account.component";
import { ApplicationComponent } from "./application/application.component";
import { SchoolComponent } from "./school/school.component";
import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from "./user/login";

import { HTTP_INTERCEPTORS } from "@angular/common/http";
import { TokenInterceptor } from "./user/token.interceptor";



@NgModule({
<<<<<<< HEAD



=======
<<<<<<< HEAD
=======



>>>>>>> db9abb4a47de7be7c0cc363c5cf5ab39f622ccc7
>>>>>>> c7a88bc1827aed0a794608f53aa93a4269b9d588
  declarations: [
    AppComponent,
    ApplicationComponent,
    HomeComponent,
    AboutComponent,
    ContactComponent,
    AccountComponent,
    ApplicationComponent,
<<<<<<< HEAD
    SchoolComponent,
    SignupComponent,
    LoginComponent,
    SchoolComponent,
=======
<<<<<<< HEAD
    SchoolComponent,  
>>>>>>> c7a88bc1827aed0a794608f53aa93a4269b9d588
    StreamsComponent,
    SubjectsComponent,
    RegisterComponent,
    RequirementsComponent,
  ],
  imports: [
    BrowserModule,
    MatToolbarModule,
    BrowserAnimationsModule,
    MdbCollapseModule,
    appRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
<<<<<<< HEAD
=======
    
  ],
  bootstrap: [AppComponent]
  
})
=======
    SchoolComponent,
>>>>>>> db9abb4a47de7be7c0cc363c5cf5ab39f622ccc7

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
   
   
>>>>>>> c7a88bc1827aed0a794608f53aa93a4269b9d588
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


