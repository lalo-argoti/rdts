import { Component, OnInit } from '@angular/core';
import { Router,ActivatedRoute } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-registrar-form',
  templateUrl: './registrar-form.component.html',
  styleUrls: ['./registrar-form.component.css'],
})
export class RegistrarFormComponent {
  username: string = '';
  password: string = '';
  confirmPassword: string = '';
  inputCode: string = '';

  constructor(private router: Router) {}

  // Manejar el envío del formulario
  onSubmit() {
    // Validar que las contraseñas coincidan antes de enviar
    if (this.password === this.confirmPassword) {
      console.log('Formulario de registro enviado', {
        username: this.username,
        password: this.password,
        inputCode: this.inputCode,
      });

      // Redirigir a la página de éxito o a donde necesites
      this.router.navigate(['/login']);
    } else {
      console.log('Las contraseñas no coinciden');
    }
  }
}

