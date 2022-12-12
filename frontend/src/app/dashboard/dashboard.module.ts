import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DeshboardComponent } from './admin/deshboard/deshboard.component';
import { ApplicantDetailsComponent } from './admin/applicant-details/applicant-details.component';




@NgModule({
  declarations: [

  
    DeshboardComponent,
         ApplicantDetailsComponent
  ],
  imports: [
    CommonModule
  ]
})
export class DashboardModule { }
