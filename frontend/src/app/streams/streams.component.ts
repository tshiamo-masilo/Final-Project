import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Requirements } from './Requirement.model';
import { StreamServiceService } from './Services/stream-service.service';


@Component({
  selector: 'app-streams',
  templateUrl: './streams.component.html',
  styleUrls: ['./streams.component.css']
})
export class StreamsComponent implements OnInit {
  reqform: FormGroup = new FormGroup({});
  requirements!: Requirements[];
 
  constructor(
    private formBuilder: FormBuilder,
    private streamService: StreamServiceService
  ) { }


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
    this.streamService.submittingRequirements(this.reqform.value).subscribe((data:any) =>{
      alert("Submitted")
    })

  }
  ngOnInit(): void {
    this.requirementform();

  }
}
