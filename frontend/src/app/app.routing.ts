import { LoginComponent } from './user/login/login.component';
import { Routes, RouterModule } from '@angular/router';
import { UserModule } from './user/user.module';


import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact';
import { AboutComponent } from './about';
import { AccountComponent } from './account';
import { LoginGuard } from './user/guards/login.guard';
import { StudentComponent } from './dashboard';
import { SignupComponent } from './user/signup';

// import 

const routes: Routes = [
     { 
        path: 'home', component: HomeComponent,
        // canActivate: [ LoginGuard ],
        children: [
           
            { path: 'account', component: AccountComponent },
            { path: 'student', component: StudentComponent },
       ] },
       {path:'login',component:LoginComponent},
       { path: 'contact', component: ContactComponent },
       { path: 'about', component: AboutComponent },
       {path:'signup',component:SignupComponent}


];

export const appRoutingModule = RouterModule.forRoot(routes);