import { ComponentFixture, TestBed } from '@angular/core/testing';
import { TareasComponent } from './tareas.component'; // Nombre de la clase con "T" mayúscula

describe('TareasComponent', () => {  // También cambiamos aquí a "TareasComponent"
  let component: TareasComponent;  // Uso de "T" mayúscula
  let fixture: ComponentFixture<TareasComponent>;  // Uso de "T" mayúscula

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TareasComponent]  // "TareasComponent" con la "T" mayúscula
    })
    .compileComponents();

    fixture = TestBed.createComponent(TareasComponent);  // Uso de "T" mayúscula
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
