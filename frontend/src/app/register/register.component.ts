import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { SchoolsServiceService } from './service/schoolservice.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  form: FormGroup = new FormGroup({});
  constructor(private formBuilder: FormBuilder, private schoolService: SchoolsServiceService) { }

  creatingForm(): void {
    this.form = this.formBuilder.group({
      school_Name: [''],
      admin_name: [''],
      admin_Emp_No: [''],
      postal_Address: [''],
      street_name: [''],
      suburb: [''],
      city: [''],
      postal_code: ['']
    })
  }

  Onsubmit() {
    this.schoolService.savingSchool(this.form.value).subscribe(res => {
      alert('School saved successfully');
    })
    console.log(this.form.value)
  }
  ngOnInit(): void {
    this.schoolService.get(1).subscribe(data=>{
      console.log(data)
    })
    this.creatingForm();
  }
}
