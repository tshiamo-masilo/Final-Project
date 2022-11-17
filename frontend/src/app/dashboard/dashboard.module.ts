import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AdminComponent } from './admin/admin.component';
import { StudentComponent } from './student/student.component';



@NgModule({
  declarations: [
    StudentComponent,
    AdminComponent,
  ],
  imports: [
    CommonModule
  ]
})
export class DashboardModule { }
