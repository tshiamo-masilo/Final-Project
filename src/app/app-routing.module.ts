import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './usermanagement/login/login.component';

const routes: Routes = [

  {
    path: 'login',
    component: LoginComponent
  },
  {
    path:"**",
    redirectTo: '',
    pathMatch: 'full'
  }
/*
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: '',
    loadChildren: () => import('./master-layout/master-layout.module').then(m => m.MasterLayoutModule),
    canActivate: [ LoginGuard ]
  },
*/ 

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
