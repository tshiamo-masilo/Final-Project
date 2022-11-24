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
import { JuniorSubjectsComponent } from './junior-subjects';
import { HighSchollSubjectsComponent } from './high-scholl-subjects';



// import { DashboardModule } from './dashboard';
// import { AdminComponent } from './dashboard/admin';
// import { LearnerComponent } from './dashboard/learner';




const routes: Routes = [
    { path: 'home', component: HomeComponent },
    { path: 'contact', component: ContactComponent },
    { path: 'about', component: AboutComponent },
    { path: 'account', component: AccountComponent },
    { path: 'login', component: LoginComponent },
    { path: 'signup', component: SignupComponent },
    { path: 'forgot', component: ForgotComponent },
    { path: 'application', component: ApplicationComponent },
    { path: 'navbar', component: NavbarComponent },
    {path:'streams', component:StreamsComponent },
    {path:'requirements', component: RequirementsComponent},
    {path:'jsubjects',component:JuniorSubjectsComponent},
    {path:'hsubjects',component:HighSchollSubjectsComponent},


    // otherwise redirect to home
    { path: '**', redirectTo: 'home', pathMatch: "full" }
];

export const appRoutingModule = RouterModule.forRoot(routes);