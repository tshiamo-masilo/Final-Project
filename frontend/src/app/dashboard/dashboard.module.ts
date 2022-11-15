import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LearnerComponent } from './learner/learner.component';
import { AdminComponent } from './admin/admin.component';
import { StudentComponent } from './student/student.component';



@NgModule({
  declarations: [
    LearnerComponent,
    AdminComponent,
    StudentComponent
  ],
  imports: [
    CommonModule
  ]
})
export class DashboardModule { }
