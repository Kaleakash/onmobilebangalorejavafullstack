import { TestBed } from '@angular/core/testing';

import { FakeServiceService } from './fake-service.service';

describe('FakeServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: FakeServiceService = TestBed.get(FakeServiceService);
    expect(service).toBeTruthy();
  });
});
