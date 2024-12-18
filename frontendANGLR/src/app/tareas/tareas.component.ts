import { Component, OnInit, OnDestroy } from '@angular/core';
import { FormsModule } from '@angular/forms';  // Asegúrate de importar FormsModule aquí
import { ApiServiceTsService } from '../api.service.ts.service';  // Asegúrate de ajustar esta ruta si es necesario
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-tareas',
  standalone: true,  // Indica que este es un componente independiente
  templateUrl: './tareas.component.html',
  styleUrls: ['./tareas.component.css'],
  imports: [FormsModule]  // Asegúrate de agregar FormsModule en imports aquí
})
export class TareasComponent implements OnInit, OnDestroy {
  // Definición de variables
  selectedUser: string = '';  // Para enlazar con ngModel
  users: string[] = ['Mis', 'usuario1', 'usuario2'];  // Lista de usuarios
  tasks: string[] = [];  // Tareas del usuario seleccionado
  private pollingSubscription: Subscription | undefined;

  constructor(private apiService: ApiServiceTsService) {}

  ngOnInit() {
    // Código para inicializar el componente si es necesario
  }

  ngOnDestroy() {
    if (this.pollingSubscription) {
      this.pollingSubscription.unsubscribe();
    }
  }

  // Método para obtener las tareas de un usuario
  getTasks(user: string) {
    // Aquí agregas la lógica para obtener las tareas del usuario
    // Simularemos con datos estáticos
    if (user === 'Mis') {
      this.tasks = ['Tarea 1', 'Tarea 2'];
    } else if (user === 'usuario1') {
      this.tasks = ['Tarea de usuario 1', 'Tarea 2 de usuario 1'];
    } else if (user === 'usuario2') {
      this.tasks = ['Tarea de usuario 2', 'Tarea 2 de usuario 2'];
    }
  }
}
