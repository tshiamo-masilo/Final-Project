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
  constructor(private formBuilder: FormBuilder, private streamService: StreamServiceService) { }
  formBinding() {
    this.form = this.formBuilder.group({
      streamName: ['']
    })
  }
  ngOnInit(): void {
    this.formBinding()
  }
  onSubmit() {
    this.streamService.submittingStreams(this.form.value).subscribe(data => {
      alert("Stream Successfully submitted")
      this.form.reset()
    })
  }
}
