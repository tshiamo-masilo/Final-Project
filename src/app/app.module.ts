import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';


import { AppRoutingModule } from './app-routing.module';
import {MatToolbarModule} from '@angular/material/toolbar';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { UsermanagementComponent } from './usermanagement/usermanagement.component';
import { LoginComponent } from './usermanagement/login/login.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MdbCollapseModule } from 'mdb-angular-ui-kit/collapse';
import { UsermanagmentModule } from './usermanagement/usermanagment.module';
import { RegisterComponent } from './register/register.component';
import { ApplicationFormComponent } from './application-form/application-form.component';
//import { LoginComponent } from './usermanagement/login/login.component';



@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    UsermanagementComponent,
    RegisterComponent,
    ApplicationFormComponent,
    //LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatToolbarModule,
    BrowserAnimationsModule,
    MdbCollapseModule,
    UsermanagmentModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule { }
export class PizzaPartyAppModule { }
