import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { AccountModule } from './account.module';
import { AccountService } from './services/account.service';


@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.css']
})
export class AccountComponent implements OnInit {
  arrayOfDetails: any;
  name: any;

  constructor(private formBuider: FormBuilder, private accountService: AccountService ) { }
  updates: FormGroup = new FormGroup({});
  ngOnInit(): void {
    this.updateDetails();
    this.updates = this.formBuider.group({
      fullName: [this.arrayOfDetails.fullName],
      identification: [this.arrayOfDetails.id],
      gender: [this.arrayOfDetails.gender],
      dateOfBirth: [],
      nationality: [this.arrayOfDetails.nationality],
      homeLanguage: [this.arrayOfDetails.homeLanguage],
      mobileNumber: [this.arrayOfDetails.phone],
      guardianFullName: [this.arrayOfDetails.guardianFullName],
      guardianEmail: [this.arrayOfDetails.guardianEmail],
      guardianPhoneNumber: [this.arrayOfDetails.guardianPhone],
      address: [this.arrayOfDetails.homeAddress],
      postalCode: [this.arrayOfDetails.code],
    })
    this.accountService.getStudentApplicationById().subscribe((res: any) => {
      console.log(res);
    });
  }
  updateDetails() {
    this.arrayOfDetails = this.accountService.updateDetails();
   
  }
  update() {

  }

}
