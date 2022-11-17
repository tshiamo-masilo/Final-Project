import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-school',
  templateUrl: './school.component.html',
  styleUrls: ['./school.component.css']
})
export class SchoolComponent implements OnInit {
  form: FormGroup = new FormGroup({});
  constructor(private formBuilder: FormBuilder,) { }

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
    console.log(this.form.value)
  }
  ngOnInit(): void {
    this.creatingForm();
  }

}
