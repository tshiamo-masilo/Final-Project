import { LoginComponent } from './user/login/login.component';
import { Routes, RouterModule } from '@angular/router';
import { UserModule } from './user/user.module';


import { HomeComponent } from './home';
import { ContactComponent } from './contact';
import { AboutComponent } from './about';
import { AccountComponent } from './account';

import { SignupComponent } from './user/signup';



// import { DashboardModule } from './dashboard';
// import { AdminComponent } from './dashboard/admin';
// import { LearnerComponent } from './dashboard/learner';




const routes: Routes = [
    { path: 'home', component: HomeComponent },
    { path: 'contact', component: ContactComponent },
    { path: 'about', component: AboutComponent },
    { path: 'account', component: AccountComponent },
    { path: 'signUp', component: SignupComponent },
    { path: 'signIn', component: LoginComponent },


    // otherwise redirect to home
    { path: '**', redirectTo: 'home', pathMatch:"full" }
];

export const appRoutingModule = RouterModule.forRoot(routes);