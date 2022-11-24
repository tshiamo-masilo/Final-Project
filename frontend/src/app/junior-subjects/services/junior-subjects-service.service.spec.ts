import { TestBed } from '@angular/core/testing';

import { JuniorSubjectsServiceService } from './junior-subjects-service.service';

describe('JuniorSubjectsServiceService', () => {
  let service: JuniorSubjectsServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(JuniorSubjectsServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
