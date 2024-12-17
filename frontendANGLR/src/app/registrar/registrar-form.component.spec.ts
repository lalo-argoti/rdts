import { ComponentFixture, TestBed } from '@angular/core/testing';
import { RegistrarFormComponent } from './registrar-form.component';  // Asegúrate de importar el componente correcto

describe('RegistrarFormComponent', () => {
  let component: RegistrarFormComponent;  // Usa el nombre correcto de la clase
  let fixture: ComponentFixture<RegistrarFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [RegistrarFormComponent]  // Asegúrate de usar el nombre correcto del componente
    })
    .compileComponents();

    fixture = TestBed.createComponent(RegistrarFormComponent);  // Asegúrate de usar el nombre correcto de la clase
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
