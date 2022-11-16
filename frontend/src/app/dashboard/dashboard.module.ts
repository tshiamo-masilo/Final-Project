import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LearnerComponent } from './learner/learner.component';
import { AdminComponent } from './admin/admin.component';
import { Router } from '@angular/router';
import { ApplicationsComponent } from './admin/viewApplications/applications/applications.component';


@NgModule({
  declarations: [
    LearnerComponent,
    AdminComponent,
    ApplicationsComponent
  ],
  imports: [
    CommonModule
  ]
})
export class DashboardModule { }
