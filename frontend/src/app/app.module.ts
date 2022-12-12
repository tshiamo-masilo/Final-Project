import { BrowserModule } from '@angular/platform-browser';
import { appRoutingModule } from './app.routing';
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
import { SignupComponent } from './user/signup/signup.component';
import { ReactiveFormsModule } from "@angular/forms";
import { LoginComponent } from "./user/login";
import { HTTP_INTERCEPTORS } from "@angular/common/http";
import { TokenInterceptor } from "./user/token.interceptor";
import { StreamsComponent } from './streams/streams.component';
import { RequirementsComponent } from './requirements/requirements.component';
import { SubjectComponent } from './subject/subject.component';
import { AdminDashboardModule } from "./admin-dashboard/admin-dashboard.module";
import { TestingComponent } from './testing/testing.component';
import { DetailsComponent } from './details/details.component';



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
        TestingComponent,
        DetailsComponent,
    ],
    bootstrap: [AppComponent],
    providers: [
        {
            provide: HTTP_INTERCEPTORS,
            useClass: TokenInterceptor,
            multi: true
        }
    ],
    imports: [
        BrowserModule,
        MatToolbarModule,
        BrowserAnimationsModule,
        MdbCollapseModule,
        NgxPaginationModule,
        HttpClientModule,
        FormsModule,
        FilterPipeModule,
        ReactiveFormsModule,
        appRoutingModule,
        AdminDashboardModule,
    ]
})
export class AppModule {}


