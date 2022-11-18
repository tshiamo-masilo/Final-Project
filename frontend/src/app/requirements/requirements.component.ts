import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { RequirementsServiceService } from './service/requirements-service.service';

@Component({
  selector: 'app-requirements',
  templateUrl: './requirements.component.html',
  styleUrls: ['./requirements.component.css']
})
export class RequirementsComponent implements OnInit {

  form: FormGroup = new FormGroup({});
  streamlist: any[] = ["Select a stream"]
  streams: any[] = []
  stream: any;
  num: any;


  constructor(
    private formBuilder: FormBuilder,
    private streamService: RequirementsServiceService
  ) { }

  onSelectedStream(value: any) {
    this.stream = value;
    if (this.stream === "Select Stream") {
      this.num = 0;
    } else {
      this.num = 1;
    }
  }
  requirementform() {
    this.form = this.formBuilder.group({
      maths: [''],
      naturalScience: [''],
      technology: [''],
      ems: [''],
      arts: [''],
      socialScience: [''],
    });
  }

  Onsubmit() {
    this.valid()
  }
  valid() {

    if (this.form.value.maths.length === 0 || this.form.value.naturalScience.length === 0 || this.form.value.technology.length === 0) {
      alert("Select all the stream requirements")
    } else {
      this.streamService.submittingRequirements(this.form.value).subscribe((data: any) => {
        alert("Submitted")
        this.form.reset();
      })

    }
  }
  ngOnInit(): void {
    this.requirementform();
    this.streamService.getAllStreams().subscribe(data => {
      this.streams.push(data)
      this.streams.forEach(result => {
        result.forEach((res: any) => {
          this.streamlist.push(res.streamName)
        })
      })
    })

  }

}
