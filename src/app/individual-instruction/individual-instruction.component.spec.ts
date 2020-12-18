import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { IndividualInstructionComponent } from './individual-instruction.component';

describe('IndividualInstructionComponent', () => {
  let component: IndividualInstructionComponent;
  let fixture: ComponentFixture<IndividualInstructionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ IndividualInstructionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(IndividualInstructionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
