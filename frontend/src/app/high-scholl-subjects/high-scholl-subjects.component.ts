import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { HighSchoolSubjectServiceService } from './services/high-school-subject-service.service';

@Component({
  selector: 'app-high-scholl-subjects',
  templateUrl: './high-scholl-subjects.component.html',
  styleUrls: ['./high-scholl-subjects.component.css']
})
export class HighSchollSubjectsComponent implements OnInit {

  form: FormGroup = new FormGroup({});
  
  constructor(private formBuilder: FormBuilder, private service:HighSchoolSubjectServiceService) { }

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
      alert("Select all the stream requirements")
    } else {
      alert("Subject Successfully submitted")
      console.log(this.form.value);
      this.service.submittingHighSchoolSubjects(this.form.value).subscribe((data: any) => {
        alert("Subject Successfully submitted")
        this.form.reset()
      })
    }
  }

}
