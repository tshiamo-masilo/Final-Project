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
      streamDescription: ['', Validators.requiredTrue],
      streamName: ['', Validators.required],
    })
  }

  ngOnInit(): void {
    this.formBinding()
    // getting school list to get school IDs
    // this.streamService.getSchool()
    //   .subscribe((data: any) => {
    //     console.log(data)
    //     this.schoolList = data;
    //     this.SchoolIds.push(this.schoolList)
    //     this.SchoolIds.forEach(result => {
    //       result.forEach((res: any) => {
    //         this.schoolIds.push(res.id);
    //       })
    //     })


    //   })
  }
  
  onSubmit() {
    //sending form to database
    if (this.form.value.streamDescription.length === 0 || this.form.value.streamName.length === 0) {
      alert("Select all the stream requirements")
    } else {
      alert("Stream Successfully submitted")
      this.streamService.submittingStreams(this.form.value).subscribe((data: any) => {
        alert("Stream Successfully submitted")
        this.form.reset()
      })
    }

  }
}
