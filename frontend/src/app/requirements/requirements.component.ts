import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { RequirementsServiceService } from './service/requirements-service.service';

@Component({
  selector: 'app-requirements',
  templateUrl: './requirements.component.html',
  styleUrls: ['./requirements.component.css']
})
export class RequirementsComponent implements OnInit {

  reqform: FormGroup = new FormGroup({});
  streamlist: String[] = ["Select Stream", "Science", "Commerce", "General"]
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
    this.reqform = this.formBuilder.group({
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

    if (this.reqform.value.maths.length === 0 || this.reqform.value.naturalScience.length === 0 || this.reqform.value.technology.length === 0) {
      alert("Select all the stream requirements")
    } else {
      this.streamService.submittingRequirements(this.reqform.value).subscribe((data: any) => {
        alert("Submitted")
      })

    }
  }
  ngOnInit(): void {
    this.requirementform();
   
  }

}
