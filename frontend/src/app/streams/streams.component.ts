import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { StreamServiceService } from './Services/stream-service.service';


@Component({
  selector: 'app-streams',
  templateUrl: './streams.component.html',
  styleUrls: ['./streams.component.css']
})
export class StreamsComponent implements OnInit {
  schoolList: any[] = [];
  SchoolIds: any[] = [];
  schoolIds: any[] = [];
  form: FormGroup = new FormGroup({});
  
  constructor(private formBuilder: FormBuilder, private streamService: StreamServiceService) { }

  formBinding() {
    this.form = this.formBuilder.group({
      schoolId: [''],
      streamName: ['']
    })
  }
  
  ngOnInit(): void {

    this.formBinding()
    // getting school list to get school IDs
    this.streamService.getSchool()
      .subscribe((data: any) => {
        console.log(data)
        this.schoolList = data;
        this.SchoolIds.push(this.schoolList)
        this.SchoolIds.forEach(result => {
          result.forEach((res: any) => {
            this.schoolIds.push(res.id);
          })
        })


      })
  }
  onSubmit() {
    //setting school Id to the form
    this.form.get('schoolId')?.setValue(this.schoolIds[0]);
    console.log(this.form.value)
    //sending form to database
    this.streamService.submittingStreams(this.form.value).subscribe(data => {
      alert("Stream Successfully submitted")
      this.form.reset()
    })
  }
}
