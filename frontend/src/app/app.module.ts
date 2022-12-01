import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { appRoutingModule } from './app.routing';

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

import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { UserDetailsComponent } from './user-details/user-details.component';
import { HttpClientModule } from '@angular/common/http';
import { UserModule } from './user/user.module';
import { AdminDashboardModule } from './admin-dashboard/admin-dashboard.module';


@NgModule({
  declarations: [
    AppComponent,
    ApplicationComponent,
    HomeComponent,
    AboutComponent,
    ContactComponent,
    AccountComponent,
    SchoolComponent,
    UserDetailsComponent,
  ],
  imports: [
    BrowserModule,
    MatToolbarModule,
    BrowserAnimationsModule,
    MdbCollapseModule,
    ReactiveFormsModule,
    HttpClientModule,
    FormsModule,
    UserModule,
    AdminDashboardModule,
    // FilterPipeModule,
    appRoutingModule,
  ],
  bootstrap: [AppComponent]

})

export class AppModule { }
