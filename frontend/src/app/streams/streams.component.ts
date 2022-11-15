import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { StreamServiceService } from './Services/stream-service.service';

@Component({
  selector: 'app-streams',
  templateUrl: './streams.component.html',
  styleUrls: ['./streams.component.css']
})
export class StreamsComponent implements OnInit {
  form: FormGroup = new FormGroup({});
  reqform: FormGroup = new FormGroup({});
  constructor(
    private formBuilder: FormBuilder,
    private streamService: StreamServiceService
  ) {}
  streamform() {
    this.form = this.formBuilder.group({
      schoolName: [''],
      streamName: [''],
      subject1: [''],
      subject2: [''],
      subject3: [''],
      subject4: [''],
    });
  }
  requirementform() {
    this.reqform = this.formBuilder.group({
      maths: [''],
      naturalScience: [''],
      technology: [''],
      ems: [''],
      arts: [''],
      socialScience: [''],
    });
  }
  ngOnInit(): void {
    this.streamform();
    this. requirementform()

  }

  submitForm() {
    console.log("req="+this.reqform.value)
    console.log("yes"+this.form.value)
    this.streamService.submittingRequirements(this.reqform.value)
    .subscribe((_) => {
      alert('Requirements succesfully saved');
      this.reqform.reset();
    });
    this.streamService.submittingStreams(this.form.value)
      .subscribe((_) => {
        alert('stream succesfully saved');
        this.form.reset();
      });
  }
}
