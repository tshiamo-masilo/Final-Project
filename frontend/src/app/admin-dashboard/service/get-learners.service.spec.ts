import { TestBed } from '@angular/core/testing';

import { GetLearnersService } from './get-learners.service';

describe('GetLearnersService', () => {
  let service: GetLearnersService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GetLearnersService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
