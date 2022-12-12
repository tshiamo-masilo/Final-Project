import { Component, OnInit } from '@angular/core';
import { UserDetailsServiceService } from './Service/user-details-service.service';

@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent implements OnInit {

  constructor(private service: UserDetailsServiceService) { }

  ngOnInit(): void {
    this.service.getall().subscribe(data => {
      console.log(data)
    })
  }

}

