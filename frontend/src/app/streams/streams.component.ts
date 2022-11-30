import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { StreamServiceService } from './Services/stream-service.service';

@Component({
  selector: 'app-streams',
  templateUrl: './streams.component.html',
  styleUrls: ['./streams.component.css']
})
export class StreamsComponent implements OnInit {
  form: FormGroup = new FormGroup({});
  subjectlist: any[] = ["Select a subject","g"]
  subjects: any[] = []
  subject: any;
  selectedSubject: any = '';
  num: any = 0;
  constructor(private formBuilder: FormBuilder, private streamService: StreamServiceService) { }

  formBinding() {
    this.form = this.formBuilder.group({
      streamDescription: [''],
      streamName: [''],
      subjectId: ['']
    })
  }
  onSelectedSubject(value: any) {
    this.subject = value;
    this.selectedSubject = value

    if (this.subject === this.subjectlist[0]) {
      this.num = 0;
    } else {
      this.num = 1;
    }
  }
  ngOnInit(): void {
    this.formBinding()
    this.streamService.gettingSubjects().subscribe((data: any) => {
      this.subjects = data
      this.subjects.forEach(res =>{
        this.subjectlist.push(res.id+"."+res.name)
      })

    })
  }

  onSubmit() {

    if (this.form.value.streamDescription.length === 0 || this.form.value.streamName.length === 0) {
      alert("Fill all the required fields")
    } else {
      //sending form to database      
      this.form.get('subjectId')?.setValue(this.selectedSubject.substring(0, 1));
      console.log(this.form.value)
      this.streamService.submittingStreams(this.form.value).subscribe((data: any) => {
        alert("Stream successfully submitted")
        this.form.reset()
      })
    }

  }
}
