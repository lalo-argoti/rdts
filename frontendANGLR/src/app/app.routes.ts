import { Routes } from '@angular/router';
import { LoginFormComponent } from './login/login-form.component';
import { RegistrarFormComponent } from './registrar/registrar-form.component';
import { TareasComponent } from './tareas/tareas.component';

export const routes: Routes = [
  { path: '', redirectTo: '/login', pathMatch: 'full' },
  { path: 'login', component: LoginFormComponent },
  { path: 'registrar', component: RegistrarFormComponent },
  { path: 'tareas', component: TareasComponent },
];
