import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistrarseFormComponent } from './registrarse-form.component';

describe('RegistrarseFormComponent', () => {
  let component: RegistrarseFormComponent;
  let fixture: ComponentFixture<RegistrarseFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [RegistrarseFormComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RegistrarseFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
