import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { UsermanagementComponent } from './usermanagement/usermanagement.component';
import { LoginComponent } from './usermanagement/login/login.component';
import { BackGroundComponent } from './back-ground/back-ground.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    UsermanagementComponent,
    LoginComponent,
    BackGroundComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
