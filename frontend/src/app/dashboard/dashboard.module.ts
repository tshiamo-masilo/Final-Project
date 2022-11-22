import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LearnerComponent } from './learner/learner.component';
import { AdminComponent } from './admin/admin.component';



@NgModule({
  declarations: [
    LearnerComponent,
    AdminComponent
  ],
  imports: [
    CommonModule
  ]
})
export class DashboardModule { }
