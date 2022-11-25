import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { StreamServiceService } from './services/stream-service.service';

@Component({
  selector: 'app-streams',
  templateUrl: './streams.component.html',
  styleUrls: ['./streams.component.css']
})
export class StreamsComponent implements OnInit {
  form: FormGroup = new FormGroup({});

  constructor(private formBuilder: FormBuilder, private streamService: StreamServiceService) { }

  formBinding() {
    this.form = this.formBuilder.group({
      streamDescription: [''],
      streamName: [''],
    })
  }

  ngOnInit(): void {
    this.formBinding()
  }
  
  onSubmit() {
    
    if (this.form.value.streamDescription.length === 0 || this.form.value.streamName.length === 0) {
      alert("Fill all the required fields")
    } else {
      //sending form to database
      this.streamService.submittingStreams(this.form.value).subscribe((data: any) => {
        alert("Stream successfully submitted")
        this.form.reset()
      })
    }

  }
}
