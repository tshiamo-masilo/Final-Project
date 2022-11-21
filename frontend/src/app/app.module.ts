import { BrowserModule } from '@angular/platform-browser';
import { appRoutingModule } from './app.routing';
import { DashboardModule } from './dashboard/dashboard.module';

// import { UserModule } from './user/user.module';


import { MatToolbarModule } from '@angular/material/toolbar';
import { AppComponent } from './app.component';
import { NgxPaginationModule } from 'ngx-pagination';
import { HttpClientModule } from '@angular/common/http';
import { FilterPipeModule } from 'ngx-filter-pipe';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MdbCollapseModule } from 'mdb-angular-ui-kit/collapse';
import { FormsModule } from '@angular/forms';



import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';

import { AccountComponent } from './account/account.component';
import { ApplicationComponent } from './application/application.component';
import { SchoolComponent } from './school/school.component';
import { NavbarComponent } from './dashboard/navbar';
import { NgModule } from '@angular/core';
// import { LoginComponent } from './user/login/login.component';
import { SignupComponent } from './user/signup/signup.component';




@NgModule({
  imports: [
    BrowserModule,
    FilterPipeModule,
    MatToolbarModule,
    BrowserAnimationsModule,
    MdbCollapseModule,
    NgxPaginationModule,
    HttpClientModule,
    FormsModule,
    appRoutingModule,
  ],

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
  ],
  bootstrap: [AppComponent]

})

export class AppModule { }
export class PizzaPartyAppModule { }
