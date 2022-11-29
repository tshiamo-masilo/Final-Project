import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { StreamServiceService } from 'app/streams/services/stream-service.service';
import { JuniorSubjectsServiceService } from './services/junior-subjects-service.service';

@Component({
  selector: 'app-junior-subjects',
  templateUrl: './junior-subjects.component.html',
  styleUrls: ['./junior-subjects.component.css']
})
export class JuniorSubjectsComponent implements OnInit {

  form: FormGroup = new FormGroup({});

  constructor(private formBuilder: FormBuilder, private service: JuniorSubjectsServiceService) { }

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
      this.service.submittingJuniorSubjects(this.form.value).subscribe((data: any) => {
        alert("Subject successfully submitted")
        this.form.reset()
      })
    }

  }
}
