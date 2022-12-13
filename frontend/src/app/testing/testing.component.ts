import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { TestingServiceService } from './service/testing-service.service';
import { ApplicationStatus } from './shared/application-status';

@Component({
  selector: 'app-testing',
  templateUrl: './testing.component.html',
  styleUrls: ['./testing.component.css']
})
export class TestingComponent implements OnInit {

  form: FormGroup = new FormGroup({});
  applications: any[] = [
    {
      "Name": "Philasande",
      "Surname": "Bhani",
      "Email": "fgfgh@gmail.com",
      "Phone": "078214121",
      "Gender": "male",
      "Grade": "10",
      "Term": "1",
      "Status": "Accepted"
    },
    {
      "Name": "Aphelele",
      "Surname": "Lusapho",
      "Email": "aphelele@gmail.com",
      "Phone": "0785474586",
      "Gender": "male",
      "Grade": "10",
      "Term": "2",
      "Status": "Pending"
    }, {
      "Name": "Zintle",
      "Surname": "Luzipho",
      "Email": "zintle@gmail.com",
      "Phone": "0582482144",
      "Gender": "female",
      "Grade": "12",
      "Term": "2",
      "Status": "Rejected"
    }, {
      "Name": "Lwando",
      "Surname": "Qwayede",
      "Email": "qwayede@gmail.com",
      "Phone": "101114556+5658",
      "Gender": "male",
      "Grade": "11",
      "Term": "1",
      "Status": "Accepted"
    }, {
      "Name": "Philasande",
      "Surname": "Mgwatyu",
      "Email": "phila@gmail.com",
      "Phone": "10111",
      "Gender": "male",
      "Grade": "12",
      "Term": "2",
      "Status": "Pending"
    }, {
      "Name": "Nontle",
      "Surname": "Makwara",
      "Email": "ntontle@gmail.com",
      "Phone": "1011132112",
      "Gender": "female",
      "Grade": "12",
      "Term": "2",
      "Status": "Rejected"
    }
  ]
  subjectlist: any[] = ["Select a subject", "g"]
  subjects: any[] = []
  subject: any;
  selectedSubject: any = '';
  num: any = 0;
  constructor(private formBuilder: FormBuilder, private service: TestingServiceService) { }

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
  click(){
    console.log("female")
  }
  ngOnInit(): void {

  }
  getStatus(status: string) {
    switch (status) {
      case ApplicationStatus.APPROVED:
        return 'green';
      case ApplicationStatus.REJECTED:
        return 'red';
      case ApplicationStatus.PENDING:
        return 'yellow';
      default:
        return undefined;
    }
  }
  onSubmit() {


  }
}
