import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MdbCollapseModule } from 'mdb-angular-ui-kit/collapse';
import { AdminComponent } from './admin';
import { LearnerComponent } from './learner';




@NgModule({
  declarations: [
    LearnerComponent,
    AdminComponent
  ],
  imports: [
    CommonModule,
    MdbCollapseModule 
  ]
})
export class DashboardModule { }
