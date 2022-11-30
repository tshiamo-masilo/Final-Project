import { FormBuilder, FormGroup, FormControl } from '@angular/forms';
import { Component, OnInit,} from "@angular/core";
import { Validators } from "@angular/forms";
import { ApplicationServiceService } from './Services/application-service.service';
@Component({
  selector: 'app-application',
  templateUrl: './application.component.html',
  styleUrls: ['./application.component.css']
})
export class ApplicationComponent implements OnInit {
 application :any;
  title = 'Project-FrontEnd';
  submitted = false;
 


  constructor(private FormBuilder: FormBuilder,private service:ApplicationServiceService) {}
  // applicationForm = new FormGroup({
  //   fullName: new FormControl(''),
  //   idNumber:  new FormControl(''),
  //   dateOfBirth:  new FormControl(''),
  //   Nationality:  new FormControl(''),
  //   Gender: new FormControl(''),
  //   homeAddress: new FormControl (''),
  //   phoneNumber: new FormControl(''),
  //   fullname: new FormControl(''),
  //   Select: new FormControl(''),
  //   Relationship: new FormControl(''),
  //   gradeCompletion: new FormControl(''),
  //   emailAddres: new FormControl(''),
  //   checkBox: new FormControl(''),
  //   emailAddress: new FormControl(''),
  //   schoolName: new FormControl(''),
  // });



  ngOnInit() {

    //Validators.validate

    this.application = this.FormBuilder.group({
      fullName: ['', [Validators.required, Validators.minLength(4)]],
      idNumber: ['', [Validators.required, Validators.minLength(13),Validators.maxLength(13)]],
      dateOfBirth: ['', Validators.required],
      Nationality: ['', Validators.required],
      Gender: ['', Validators.required],
      homeAddress: ['', Validators.required],
      phoneNumber: ['',[ Validators.required, Validators.pattern("[0-9]*")]],
      fullname:['',Validators.required],
      Select:['',Validators.required],
      Relationship:['',Validators.required],
      gradeCompletion:['',Validators.required],
      checkBox:['',Validators.required],
      emailAddress: ['',[Validators.required, Validators.email]],
      emailAddres: ['',[Validators.required, Validators.email]],
      schoolName: ['',Validators.required],


    });
  }
  inform($event: any) {
    console.log($event);
  }

  onSubmit() {
    this.service.submit(this.application.value).subscribe((_data:any) =>{
      alert("Success applied!");
    })



    //================================================================
    this.submitted = true;

    if (this.application.invalid) {
      return;
    }
    alert("Success");
  }
}
