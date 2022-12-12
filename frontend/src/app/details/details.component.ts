import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit {
  applicantions : any[] = [
   {
        "Name": "Philasande",
        "Surname":"Bhani",
        "Email":"phila@gmail.com",
        "Phone":"0783524156",
        "Gender":"male",
        "Grade":"10",
        "Term":"1",
        "Status":"Accepted"
    }]
  constructor() { }

  ngOnInit(): void {
  }

}
