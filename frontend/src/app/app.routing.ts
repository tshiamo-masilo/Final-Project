import { LoginComponent } from './user/login/login.component';
import { Routes, RouterModule } from '@angular/router';
import { UserModule } from './user/user.module';


import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact';
import { AboutComponent } from './about';
import { AccountComponent } from './account';
import { LoginGuard } from './user/guards/login.guard';
// import 

const routes: Routes = [
    { 
        path: 'home', component: HomeComponent,
        canActivate: [ LoginGuard ],
        children: [
            { path: 'contact', component: ContactComponent },
            { path: 'about', component: AboutComponent },
            { path: 'account', component: AccountComponent },
           // { path: 'account', component: AccountComponent },
        ]
    },

    //For dev Tshifura
    {  path: 'account', component: AccountComponent },
    // {  path: 'home', component: HomeComponent },
    // otherwise redirect to home
    { path: '**', redirectTo: 'home', pathMatch:"full" }
];

export const appRoutingModule = RouterModule.forRoot(routes);