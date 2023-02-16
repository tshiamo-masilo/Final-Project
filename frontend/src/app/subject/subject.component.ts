import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { SubjectServiceService } from './service/subject-service.service';

@Component({
  selector: 'app-subject',
  templateUrl: './subject.component.html',
  styleUrls: ['./subject.component.css']
})
export class SubjectComponent implements OnInit {
  form: FormGroup = new FormGroup({});
  
  constructor(private formBuilder: FormBuilder, private service:SubjectServiceService) { }
  

  formBinding() {
    this.form = this.formBuilder.group({
      subjectDescription: [''],
      subjectName: ['']
    })
  }
  
  ngOnInit(): void {
    this.formBinding()

  }
  onSubmit() {
    //sending form to database
    if (this.form.value.subjectDescription.length === 0 || this.form.value.subjectName.length === 0) {
      alert("Fill all the required fields")
    } else {
      this.service.submittingHighSchoolSubjects(this.form.value).subscribe((data: any) => {
        alert("Subject Successfully submitted")
        this.form.reset()
      })
    }
  }


}
