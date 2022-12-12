import { TestBed } from '@angular/core/testing';

import { AdminDeshboardServiceService } from './admin-deshboard-service.service';

describe('AdminDeshboardServiceService', () => {
  let service: AdminDeshboardServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AdminDeshboardServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
