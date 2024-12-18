import { Routes } from '@angular/router';
import { LoginFormComponent } from './login-form/login-form.component';
import { RegistrarseFormComponent } from './registrarse-form/registrarse-form.component';
import { TareasComponent } from './tareas/tareas.component';

export const routes: Routes = [
  { path: '', redirectTo: '/login', pathMatch: 'full' },
  { path: 'login', component: LoginFormComponent },
  { path: 'registrarse', component: RegistrarseFormComponent },
  { path: 'tareas', component: TareasComponent },
];
