import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DoctorsTabComponent } from './doctors-tab.component';

describe('DoctorsTabComponent', () => {
  let component: DoctorsTabComponent;
  let fixture: ComponentFixture<DoctorsTabComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DoctorsTabComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DoctorsTabComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
