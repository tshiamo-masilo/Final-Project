import { Component, OnInit } from '@angular/core';
<<<<<<< HEAD
=======
import { FormBuilder, FormGroup } from '@angular/forms';
import { SchoolsServiceService } from './Services/schools-service.service';
>>>>>>> 69a29dee79dfbb0972d442b12270179118efa477

@Component({
  selector: 'app-school',
  templateUrl: './school.component.html',
  styleUrls: ['./school.component.css']
})
export class SchoolComponent implements OnInit {
<<<<<<< HEAD
ngOnInit(): void {
    
}
=======
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
>>>>>>> 69a29dee79dfbb0972d442b12270179118efa477

}
