import { Routes, RouterModule } from '@angular/router';
import { UserModule } from './user/user.module';


import { HomeComponent } from './home';
import { ContactComponent } from './contact';
import { AboutComponent } from './about';
import { AccountComponent } from './account';
import {LoginComponent} from './user/login';
import {SignupComponent} from './user/signup';
import {ForgotComponent} from './user/forgot';


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
    // { path: 'streams', component: StreamsComponent },
    

    // otherwise redirect to home
    { path: '**', redirectTo: 'home', pathMatch:"full" }
];

export const appRoutingModule = RouterModule.forRoot(routes);