import { TestBed } from '@angular/core/testing';

import { SchoolsServiceService } from './schools-service.service';

describe('SchoolsServiceService', () => {
  let service: SchoolsServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SchoolsServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
