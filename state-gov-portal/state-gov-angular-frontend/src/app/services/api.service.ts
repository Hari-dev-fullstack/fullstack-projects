import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
@Injectable({ providedIn: 'root' })
export class ApiService {
  constructor(private http: HttpClient) {}
  login(username: string, password: string) {
    return this.http.post<string>('/api/auth/login', { username, password });
  }
  register(user: any) {
    return this.http.post('/api/auth/register', user);
  }
  getMyCases() {
    return this.http.get<any[]>('/api/cases/citizen/johndoe');
  }
  bookAppointment(appt: any) {
    return this.http.post('/api/appointments/book', appt);
  }
}