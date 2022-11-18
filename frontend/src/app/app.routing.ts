import { LoginComponent } from './user/login/login.component';
import { Routes, RouterModule } from '@angular/router';
import { UserModule } from './user/user.module';


import { HomeComponent } from './home';
import { ContactComponent } from './contact';
import { AboutComponent } from './about';
import { AccountComponent } from './account';
import {LoginComponent} from './user/login';
import {SignupComponent} from './user/signup';
import {ForgotComponent} from './user/forgot';
import {StreamsComponent} from './streams';
import {SubjectsComponent} from './subjects';
import { SchoolComponent } from './school/school.component';
import { RegisterComponent } from './register';
import { RequirementsComponent } from './requirements';

import { SignupComponent } from './user/signup';



// import { DashboardModule } from './dashboard';
// import { AdminComponent } from './dashboard/admin';
// import { LearnerComponent } from './dashboard/learner';




const routes: Routes = [
    { path: 'home', component: HomeComponent },
    { path: 'contact', component: ContactComponent },
    { path: 'about', component: AboutComponent },
    { path: 'account', component: AccountComponent },
<<<<<<< HEAD
    { path: 'login', component: LoginComponent },
    { path: 'signup', component: SignupComponent },
    { path: 'forgot', component: ForgotComponent },
    { path: 'streams', component: StreamsComponent },
    {path: 'subjects', component: SubjectsComponent },
    {path: 'school', component: SchoolComponent},
    {path: 'register', component: RegisterComponent},
    {path: 'requirements', component: RequirementsComponent},
    
=======
    { path: 'signUp', component: SignupComponent },
    { path: 'signIn', component: LoginComponent },

>>>>>>> db9abb4a47de7be7c0cc363c5cf5ab39f622ccc7

    // otherwise redirect to home
    { path: '**', redirectTo: 'home', pathMatch:"full" }
];

export const appRoutingModule = RouterModule.forRoot(routes);