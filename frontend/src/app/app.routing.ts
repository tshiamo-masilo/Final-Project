import { LoginComponent } from './user/login/login.component';
import { Routes, RouterModule } from '@angular/router';
import { UserModule } from './user/user.module';


import { HomeComponent } from './home';
import { ContactComponent } from './contact';
import { AboutComponent } from './about';
import { AccountComponent } from './account';
import { LoginGuard } from './user/guards/login.guard';

const routes: Routes = [
    {
        path: '', component: HomeComponent,
        canActivate: [LoginGuard],
    },
    {
        path: 'contact', component: ContactComponent,
    },
    {
        path: 'about', component: AboutComponent,
    },
    {
        path: 'account', component: AccountComponent,
        canActivate: [LoginGuard],
    },
    { path: 'login', component: LoginComponent },
    // otherwise redirect to home
    { path: '**', redirectTo: '', pathMatch: "full" }
];

export const appRoutingModule = RouterModule.forRoot(routes);