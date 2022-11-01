import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BackGroundComponent } from './back-ground/back-ground.component';
import { AboutComponent } from './information/about/about.component';
import { ContactComponent } from './information/contact/contact.component';
import { LoginGuard } from './usermanagement/login/gaurds/login.guard';
import { LoginComponent } from './usermanagement/login/login.component';

const routes: Routes = [
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'contact',
    component: ContactComponent
  },
  {
    path: 'about',
    component: AboutComponent
  },
  {
    path: '',
    component: BackGroundComponent,
 //add for touting gaurds   canActivate: [ LoginGuard ]
  },
  // {
  //   path: '',
  //   loadChildren: () => import('./master-layout/master-layout.module').then(m => m.MasterLayoutModule),
  //   canActivate: [ LoginGuard ]
  // },
  {
    path: '**',
    redirectTo: '',
    pathMatch: 'full'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
