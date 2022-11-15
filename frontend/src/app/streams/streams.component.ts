import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { StreamServiceService } from './Services/stream-service.service';

@Component({
  selector: 'app-streams',
  templateUrl: './streams.component.html',
  styleUrls: ['./streams.component.css']
})
export class StreamsComponent implements OnInit {
  reqform: FormGroup = new FormGroup({});
  selectedMaths: any;
  selectedTechnology: any;
  selectedNaturalScience: any;
  selectedEms: any;
  selectedArts: any;
  selectedSocialScience: any;
  constructor(
    private formBuilder: FormBuilder,
    private streamService: StreamServiceService
  ) { }

  onSelectedMaths(value: string): any {
    this.selectedMaths = value.substring(0, 1);
  }
  onSelectedTechnology(value: string): any {
    this.selectedTechnology = value.substring(0, 1);
  }
  onSelectedNaturalScience(value: string): any {
    this.selectedNaturalScience = value.substring(0, 1);
  }
  onSelectedEms(value: string): any {
    this.selectedEms = value.substring(0, 1);
  }
  onSelectedArts(value: string): any {
    this.selectedArts = value.substring(0, 1);
  }
  onSelectedSocialScience(value: string): any {
    this.selectedSocialScience = value.substring(0, 1);
  }

  // requirementform() {
  //   this.reqform = this.formBuilder.group({
  //     maths: [''],
  //     naturalScience: [''],
  //     technology: [''],
  //     ems: [''],
  //     arts: [''],
  //     socialScience: [''],
  //   });
  // }
  // addingFormValues() {
  //   this.reqform.get('maths')?.setValue(this.selectedMaths);
  //   this.reqform.get('technology')?.setValue(this.selectedTechnology);
  //   this.reqform.get('naturalScience')?.setValue(this.selectedNaturalScience);
  //   this.reqform.get('ems')?.setValue(this.selectedEms);
  //   this.reqform.get('arts')?.setValue(this.selectedArts);
  //   this.reqform.get('socialScience')?.setValue(this.selectedSocialScience);
  // }
  ngOnInit(): void {
    //this.addingFormValues()
  }

}
