import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { SubjectServiceService } from './Services/subject-service.service';

@Component({
  selector: 'app-subjects',
  templateUrl: './subjects.component.html',
  styleUrls: ['./subjects.component.css']
})
export class SubjectsComponent implements OnInit {
  form: FormGroup = new FormGroup({});
  constructor(private formBuilder: FormBuilder, private subjectService: SubjectServiceService) { }

  requirementform() {
    this.form = this.formBuilder.group({
      name: [''],
      description: ['']
    });
  }
  Onsubmit() {
    
    if (this.form.value.description.length <= 0 || this.form.value.name.length <= 0) {
      alert('Please enter Subjects and its Description');
    } else {
      this.subjectService.submitingSubject(this.form.value).subscribe((data: any) => {
       this.form.reset()
       alert("Suject Saved Success")
       
      })
    }
  }

  ngOnInit(): void {
       this.requirementform()
  }

}
