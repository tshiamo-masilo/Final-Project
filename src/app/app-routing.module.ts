import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [

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
  {
    path: '**',
    redirectTo: '',
    pathMatch: 'full'
  }
*/ 

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
