import { Component, OnInit } from '@angular/core';
import { TokenService } from 'app/user/services/token.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  constructor(private token: TokenService) { }

  ngOnInit(): void {
  }
  
  isLogin() {
    console.log(this.token.getToken());
    return this.token.getToken();
  }

  onlogout(){
    sessionStorage.clear();
    location.reload();
  }
}
