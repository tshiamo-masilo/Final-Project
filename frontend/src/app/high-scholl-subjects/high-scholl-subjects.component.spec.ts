import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HighSchollSubjectsComponent } from './high-scholl-subjects.component';

describe('HighSchollSubjectsComponent', () => {
  let component: HighSchollSubjectsComponent;
  let fixture: ComponentFixture<HighSchollSubjectsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HighSchollSubjectsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HighSchollSubjectsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
