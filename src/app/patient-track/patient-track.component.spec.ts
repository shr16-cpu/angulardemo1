import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PatientTrackComponent } from './patient-track.component';

describe('PatientTrackComponent', () => {
  let component: PatientTrackComponent;
  let fixture: ComponentFixture<PatientTrackComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PatientTrackComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PatientTrackComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
