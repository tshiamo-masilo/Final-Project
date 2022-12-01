import { Routes, RouterModule } from '@angular/router';
import { UserModule } from './user/user.module';


import { HomeComponent } from './home';
import { ContactComponent } from './contact';
import { AboutComponent } from './about';
import { AccountComponent } from './account';
import { LoginComponent } from './user/login';
import { LoginGuard } from './user/guards/login.guard';
import { SignupComponent } from './user/signup';
import { LearnerComponent } from './dashboard/learner';

const routes: Routes = [
    { path: 'home', component: HomeComponent },
    { path: 'learner', component: LearnerComponent },
    { path: 'contact', component: ContactComponent },
    { path: 'about', component: AboutComponent },
    { path: 'signup', component:SignupComponent},
    { path: 'account', component: AccountComponent, canActivate: [LoginGuard], },
    { path: 'login', component: LoginComponent },
    // { path: 'forgot', component: ForgotComponent },
    // { path: 'application', component: ApplicationComponent },
    // { path: 'streams', component: StreamsComponent },
    // { path: 'xms', component: RequirementsComponent },
    // { path: 'subjects', component: SubjectComponent },
// What are we doing here?
//     {
//         path: 'navbar', component: NavbarComponent, children: [
//
//         ]
//     },


    // otherwise redirect to home
    { path: '**', redirectTo: 'home', pathMatch: "full" }
];

export const appRoutingModule = RouterModule.forRoot(routes);