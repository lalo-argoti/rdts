import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiServiceTsService {
  private apiUrl = 'http://localhost:8080/api';

  constructor(private http: HttpClient) { }


  getPartidoDetalles(user: string, partida: string, movimiento: number): Observable<any> {
  const url = `${this.apiUrl}/partido?user=${user}&partida=${partida}&movimiento=${movimiento}`;
  return this.http.get<any>(url);
     }

  getEstadoJuego(codigo: string): Observable<any> {
  const url = `${this.apiUrl}/estado?codigo=${encodeURIComponent(codigo)}`;
  return this.http.get<any>(url);
  }

  


}
