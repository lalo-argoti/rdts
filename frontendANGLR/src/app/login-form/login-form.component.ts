import { Component } from '@angular/core';
import { Router } from '@angular/router';
import {FormsModule} from '@angular/forms';
@Component({
  selector: 'app-jugador-form',
  standalone: true,
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css'],
  imports: [FormsModule]
})
export class LoginFormComponent {
  playerName: string = '';
  password: string='';
  constructor(private router: Router) {}

  onSubmit() {
    // Aquí se va a enviar el nombre a java
    console.log('usuario y contraseña enviados:', this.playerName);

    // Redirigir 
    this.router.navigate(['/tareas'],{ queryParams: { name: this.playerName } });
  }
  registrar() {
  console.log('El botón Registrar fue presionado');
  this.router.navigate(['/registrarse'],{ queryParams: { name: this.playerName } });

  
}

}
