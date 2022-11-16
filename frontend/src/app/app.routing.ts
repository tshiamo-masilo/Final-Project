import { Routes, RouterModule } from '@angular/router';
import { UserModule } from './user/user.module';


import { HomeComponent } from './home';
import { ContactComponent } from './contact';
import { AboutComponent } from './about';
import { AccountComponent } from './account';
import { ApplicationComponent } from './application';
import { StudentComponent } from './dashboard/student/student.component';


// import { DashboardModule } from './dashboard';
// import { AdminComponent } from './dashboard/admin';
// import { LearnerComponent } from './dashboard/learner';




const routes: Routes = [
    { path: 'home', component: ApplicationComponent },
    { path: 'homce', component: HomeComponent },
    { path: 'contact', component: ContactComponent },
    { path: 'about', component: AboutComponent },
    { path: 'account', component: AccountComponent },
    { path: 'student', component: StudentComponent },


    // otherwise redirect to home
    { path: '**', redirectTo: 'home', pathMatch:"full" }
];

export const appRoutingModule = RouterModule.forRoot(routes);