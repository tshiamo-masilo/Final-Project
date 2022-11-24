import { ComponentFixture, TestBed } from '@angular/core/testing';

import { JuniorSubjectsComponent } from './junior-subjects.component';

describe('JuniorSubjectsComponent', () => {
  let component: JuniorSubjectsComponent;
  let fixture: ComponentFixture<JuniorSubjectsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ JuniorSubjectsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(JuniorSubjectsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
