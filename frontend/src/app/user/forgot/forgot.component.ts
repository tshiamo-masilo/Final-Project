import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';


@Component({
  selector: 'app-forgot',
  templateUrl: './forgot.component.html',
  styleUrls: ['./forgot.component.css']
})
export class ForgotComponent implements OnInit {
 forgotForm !: FormGroup;

  constructor(private fb : FormBuilder) { }

  ngOnInit(): void {

    this.forgotForm = this.fb.group({
      email:new FormControl('', Validators.required),
      newPassword: new FormControl('', Validators.required),
      confirmPassword:new FormControl('', Validators.required),
    })
  }

  resetPassword(){
    
  }

}
