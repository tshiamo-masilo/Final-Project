import { LearnerComponent } from './dashboard/learner/learner.component';
import { Routes, RouterModule } from '@angular/router';
import { UserModule } from './user/user.module';


import { HomeComponent } from './home';
import { ContactComponent } from './contact';
import { AboutComponent } from './about';
import { AccountComponent } from './account';
import { LoginComponent } from './user/login';
import { SignupComponent } from './user/signup';
import { ForgotComponent } from './user/forgot';
import { ApplicationComponent } from './application';
import { NavbarComponent } from './dashboard/navbar';
import { StreamsComponent } from './streams';
import { RequirementsComponent } from './requirements';
import { SubjectComponent } from './subject/subject.component';
import { LoginGuard } from './user/guards/login.guard';
import { TestingComponent } from './testing/testing.component';
import { DetailsComponent } from './details/details.component';



// import { DashboardModule } from './dashboard';
// import { AdminComponent } from './dashboard/admin';
// import { LearnerComponent } from './dashboard/learner';




const routes: Routes = [
    { path: 'home', component: HomeComponent },
    { path: 'learner', component: LearnerComponent },
    { path: 'contact', component: ContactComponent },
    { path: 'about', component: AboutComponent },
    { path: 'account', component: AccountComponent, canActivate: [LoginGuard], },
    { path: 'login', component: LoginComponent },
    { path: 'signup', component: SignupComponent },
    { path: 'forgot', component: ForgotComponent },
    { path: 'application', component: ApplicationComponent }, 
    { path: 'streams', component: StreamsComponent },
    { path: 'xms', component: RequirementsComponent },
    { path: 'subjects', component: SubjectComponent },
    {path:'details', component:DetailsComponent},
    {path: 'navbar', component: NavbarComponent},
    {path: 'test', component:TestingComponent },


    // otherwise redirect to home
    { path: '**', redirectTo: 'home', pathMatch: "full" }
];

export const appRoutingModule = RouterModule.forRoot(routes);