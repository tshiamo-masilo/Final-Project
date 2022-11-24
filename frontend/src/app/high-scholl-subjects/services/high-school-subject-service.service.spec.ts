import { TestBed } from '@angular/core/testing';

import { HighSchoolSubjectServiceService } from './high-school-subject-service.service';

describe('HighSchoolSubjectServiceService', () => {
  let service: HighSchoolSubjectServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(HighSchoolSubjectServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
