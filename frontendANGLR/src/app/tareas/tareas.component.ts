import { Component, OnInit, OnDestroy } from '@angular/core';
import { FormsModule } from '@angular/forms';  // Importa FormsModule para ngModel
import { CommonModule } from '@angular/common'; // Importa CommonModule para ngIf, ngForOf
import { ApiServiceTsService } from '../api.service.ts.service'; // Ajusta la ruta si es necesario
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-tareas',
  standalone: true,  // Indica que este es un componente independiente
  templateUrl: './tareas.component.html',
  styleUrls: ['./tareas.component.css'],
  imports: [FormsModule, CommonModule]  // Asegúrate de agregar CommonModule aquí
})
export class TareasComponent implements OnInit, OnDestroy {
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

  getTasks(user: string) {
    if (user === 'Mis') {
      this.tasks = ['Tarea 1', 'Tarea 2'];
    } else if (user === 'usuario1') {
      this.tasks = ['Tarea de usuario 1', 'Tarea 2 de usuario 1'];
    } else if (user === 'usuario2') {
      this.tasks = ['Tarea de usuario 2', 'Tarea 2 de usuario 2'];
    }
  }

  // Función para eliminar una tarea de la lista
  deleteTask(index: number) {
    this.tasks.splice(index, 1); // Elimina la tarea en el índice especificado
  }
}
