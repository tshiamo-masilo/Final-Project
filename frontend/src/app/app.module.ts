import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { appRoutingModule } from './app.routing';
import { DashboardModule } from './dashboard/dashboard.module';
import { UserModule } from './user/user.module';


import { MatToolbarModule } from '@angular/material/toolbar';
import { AppComponent } from './app.component';


import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MdbCollapseModule } from 'mdb-angular-ui-kit/collapse';



import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';

import { AccountComponent } from './account/account.component';
import { ApplicationComponent } from './application/application.component';
import { SchoolComponent } from './school/school.component';

// import { LoginComponent } from './user/login/login.component';
import { SignupComponent } from './user/signup/signup.component';
import { DashboardComponent } from '../app/admin-dashboard/dashboard/dashboard.component';
import { ReactiveFormsModule } from '@angular/forms';
import { UserDetailsComponent } from './user-details/user-details.component';
import { HttpClientModule } from '@angular/common/http';




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
    NavbarComponent,
    SignupComponent,
    LoginComponent,
    StreamsComponent,
    RequirementsComponent,
    SubjectComponent,
  ],
  imports: [
    BrowserModule,
    MatToolbarModule,
    BrowserAnimationsModule,
    MdbCollapseModule,
    ReactiveFormsModule,
    NgxPaginationModule,
    HttpClientModule,
    appRoutingModule,
    FormsModule,
    UserModule,
    AdminDashboardModule,
    // FilterPipeModule,
    appRoutingModule,
  ],
  bootstrap: [AppComponent]
})

export class AppModule { }
