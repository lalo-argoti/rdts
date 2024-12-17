import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common'; 

@Component({
  selector: 'app-login-form',
  standalone: true,
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css'],
  imports: [FormsModule]
})
export class LoginFormComponent {
  playerName: string = '';
  password: string = '';  // Variable para la contraseña
  errorMessage: string = '';  // Mensaje de error

  constructor(private router: Router) {}

  // Enviar el formulario
  onSubmit() {
    // Lógica para validar las credenciales
    if (this.isValidCredentials(this.playerName, this.password)) {
      // Si las credenciales son válidas, redirigir a la página de tareas
      this.router.navigate(['/tareas'], { queryParams: { name: this.playerName, password: this.password } });
    } else {
      // Si las credenciales no son válidas, mostrar un mensaje de error
      this.errorMessage = 'Credenciales incorrectas. Por favor, intenta nuevamente o regístrate.';
    }
  }

  // Función para validar las credenciales
  isValidCredentials(playerName: string, password: string): boolean {
    // Aquí puedes agregar tu lógica de validación (por ejemplo, comparar con una lista de usuarios registrados)
    // Ejemplo simple: Si el nombre es 'juan' y la contraseña es '12345', son válidas
    return playerName === 'juan' && password === '12345';
  }
}
