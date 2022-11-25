import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { RequirementsServicesService } from './services/requirements-services.service';

@Component({
  selector: 'app-requirements',
  templateUrl: './requirements.component.html',
  styleUrls: ['./requirements.component.css']
})
export class RequirementsComponent implements OnInit {

  form: FormGroup = new FormGroup({});
  streamlist: any[] = ["Select a stream"]
  stream: any;
  selectedStream: any = '';
  num1: any = 0;

  subjectlist: any[] = ["Select a subject"]
  subject: any;
  selectedSubject: any = '';
  num: any = 0;
  constructor(private formBuilder: FormBuilder, private service: RequirementsServicesService) { }

  formBinding() {
    this.form = this.formBuilder.group({
      streamId: [''],
      subjectId: [''],
      level: ['']

    })
  }
  onSelectedSubject(value: any) {
    this.subject = value;
    this.selectedSubject = value

    if (this.subject === this.subjectlist[0]) {
      this.num1 = 0;
    } else {
      this.num1 = 1;
    }
  }
  onSelectedStream(value: any) {
    this.stream = value;
    this.selectedStream = value

    if (this.stream === this.streamlist[0]) {
      this.num = 0;
    } else {
      this.num = 1;
    }
  }
  ngOnInit(): void {
    this.formBinding()
    

  }
  onSubmit() {
    if (this.selectedStream.length > 0 && this.selectedSubject.length > 0 && this.form.value.level.length > 0) {
      //sending form to database   
      this.form.get('streamId')?.setValue(this.selectedStream.substring(0, 1));
      this.form.get('subjectId')?.setValue(this.selectedSubject.substring(0, 1));
      this.service.submittingRequirements(this.form.value).subscribe((data: any) => {
        alert("Requirement successfully submitted")
        this.form.reset()
      })
    }
    else {
      alert("Fill all the required fields")
    }





  }

}
