// src/app/registrarse-form/registrarse-form.component.ts
import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { ApiService } from '../tareas/api.service';

@Component({
  selector: 'app-registrarse-form',
  standalone: true,
  templateUrl: './registrarse-form.component.html',
  styleUrls: ['./registrarse-form.component.css'],
  imports: [CommonModule, FormsModule]
})
export class RegistrarseFormComponent implements OnInit {
  playerName: string = '';
  inputCode: string = '';
  generatedCode: string = '';

  username: string = '';
  password: string = '';
  confirmPassword: string = '';
  invitationCode: string = ''; // opcional
  errorMessage: string = '';
  successMessage: string = '';

  constructor(private router: Router, private route: ActivatedRoute, private apiService: ApiService) {}

  ngOnInit() {
    this.generatedCode = this.generateRandomCode(5);
    this.route.queryParams.subscribe(params => { this.playerName = params['name'] || null; });
  }

  onRegister() {
    if (this.password !== this.confirmPassword) {
      this.errorMessage = 'Las contraseñas no coinciden.';
      this.successMessage = '';
      return;
    } else {
      // Aquí asumimos que el usuario ingresa un email o lo generas en base al username.
      // Si tienes un campo para email en el formulario, úsalo directamente.
      const email = this.username + '@example.com';

      this.apiService.register(this.username, email, this.password).subscribe({
        next: (response: any) => {
          this.successMessage = response; // "Usuario registrado con éxito."
          this.errorMessage = '';
          setTimeout(() => {
            this.router.navigate(['/login']);
          }, 2000);
        },
        error: (error: any) => {
          this.errorMessage = error;
          this.successMessage = '';
        }
      });
    }
  }

  generateRandomCode(length: number): string {
    const chars = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
    let code = '';
    for (let i = 0; i < length; i++) {
      const randomIndex = Math.floor(Math.random() * chars.length);
      code += chars[randomIndex];
    }
    return code;
  }

  onSubmit() {
    const codeToSubmit = this.inputCode || this.generatedCode;
    console.log('Código enviado:', codeToSubmit,'Jugador local:', this.playerName);
    this.router.navigate(['/juego'], { queryParams: { code: codeToSubmit , playerName: this.playerName } });
  }

  useGeneratedCode() {
    console.log('Entrando con código generado:', this.generatedCode,'Jugador local:', this.playerName );
    this.router.navigate(['/juego'], { queryParams: { code: "S"+this.generatedCode, playerName: this.playerName }});
  }

  clearInput() {
    this.inputCode = '';
  }
}
