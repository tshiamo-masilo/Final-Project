import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { UsermanagementComponent } from './usermanagement/usermanagement.component';
import { LoginComponent } from './usermanagement/login/login.component';
import { BackGroundComponent } from './back-ground/back-ground.component';
import { RegisterComponent } from './usermanagement/register/register/register.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { SchoolComponent } from './school/school.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    UsermanagementComponent,
    LoginComponent,
    BackGroundComponent,
    RegisterComponent,
    AdminDashboardComponent,
    SchoolComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
