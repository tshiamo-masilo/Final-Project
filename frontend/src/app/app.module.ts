import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { appRoutingModule } from './app.routing';
import { DashboardModule } from './dashboard/dashboard.module';
import { UserModule } from './user/user.module';


import { MatToolbarModule } from '@angular/material/toolbar';
import { AppComponent } from './app.component';


import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';

import { AccountComponent } from './account/account.component';
import { ApplicationComponent } from './application/application.component';
import { SchoolComponent } from './school/school.component';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AdminDashboardModule } from './admin-dashboard/admin-dashboard.module';
import { SubjectComponent } from './subject/subject.component';
import { RequirementsComponent } from './requirements';
import { StreamsComponent } from './streams';
import { NavbarComponent } from './navbar';
import { MdbCollapseModule } from 'mdb-angular-ui-kit/collapse';
import { NgxPaginationModule } from 'ngx-pagination';
import { FilterPipeModule } from 'ngx-filter-pipe';

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
    StreamsComponent,
    RequirementsComponent,
    SubjectComponent,
    NavbarComponent
  ],
  imports: [
    BrowserModule,
    MatToolbarModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    NgxPaginationModule,
    HttpClientModule,
    appRoutingModule,
    FormsModule,
    UserModule,
    AdminDashboardModule,
    DashboardModule,
    FilterPipeModule,
    MdbCollapseModule,
    appRoutingModule,
  ],
  bootstrap: [AppComponent]
})

export class AppModule { }
