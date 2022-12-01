import { TestBed } from '@angular/core/testing';

import { RequirementsServicesService } from './requirements-services.service';

describe('RequirementsServicesService', () => {
  let service: RequirementsServicesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RequirementsServicesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
