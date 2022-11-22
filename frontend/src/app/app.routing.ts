import { Routes, RouterModule } from '@angular/router';
import { UserModule } from './user/user.module';


import { HomeComponent } from './home';
import { ContactComponent } from './contact';
import { AboutComponent } from './about';
import { AccountComponent } from './account';
import { LoginComponent } from './user/login';
import { UserDetailsComponent } from './user-details/user-details.component';

const routes: Routes = [
    { path: 'home', component: HomeComponent },
    { path: 'contact', component: ContactComponent },
    { path: 'about', component: AboutComponent },
    { path: 'account', component: AccountComponent },
    { path: 'login', component: LoginComponent },
    {path:'userdetails',component:UserDetailsComponent},


    // otherwise redirect to home
    { path: '**', redirectTo: 'home', pathMatch: "full" }
];

export const appRoutingModule = RouterModule.forRoot(routes);