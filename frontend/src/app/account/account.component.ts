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
  FullName: any;
  Identification: any;
  Gender: any;
  DateOfBirth: any;
  Nationality: any;
  HomeLanguage: any;
  MobileNumber: any;
  GuardianFullName: any;
  GuardianEmail: any;
  GuardianPhoneNumber: any;
  Address: any;
  code: any;
  fff:any;


  constructor(private formBuider: FormBuilder, private accountService: AccountService) { }
  updates: FormGroup = new FormGroup({});
  public getAccount(): void {



  }
  ngOnInit(): void {
    this.update()
    this.accountService.getStudentApplicationById(1).subscribe((res: any) => {
      console.log(res);
      this.FullName = res.FullName;
      this.Identification = res.Identification;
      this.Gender = res.Gender;
      this.DateOfBirth = res.DateOfBirth;
      this.Nationality = res.Nationality;
      this.HomeLanguage = res.HomeLanguage;
      this.MobileNumber = res.MobileNumber;
      this.GuardianFullName = res.GuardianFullName;
      this.GuardianEmail = res.GuardianEmail;
      this.GuardianPhoneNumber = res.GuardianPhoneNumber;
      this.Address = res.Address;
      this.code = res.code;
    });

  }
  updateDetails() {
 
  }
  update() {
    // this.updateDetails();
    // this.updates = this.formBuider.group({
    //   fullName: [this.arrayOfDetails.fullName],
    //   identification: [this.arrayOfDetails.id],
    //   gender: [this.arrayOfDetails.gender],
    //   dateOfBirth: [],
    //   nationality: [this.arrayOfDetails.nationality],
    //   homeLanguage: [this.arrayOfDetails.homeLanguage],
    //   mobileNumber: [this.arrayOfDetails.phone],
    //   guardianFullName: [this.arrayOfDetails.guardianFullName],
    //   guardianEmail: [this.arrayOfDetails.guardianEmail],
    //   guardianPhoneNumber: [this.arrayOfDetails.guardianPhone],
    //   address: [this.arrayOfDetails.homeAddress],
    //   postalCode: [this.arrayOfDetails.code],
    // })
  }

}
