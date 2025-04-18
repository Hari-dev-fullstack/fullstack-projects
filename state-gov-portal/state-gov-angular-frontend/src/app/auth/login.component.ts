import { Component } from '@angular/core';
import { ApiService } from '../services/api.service';
@Component({ selector: 'app-login', template: '<h2>Login</h2>' })
export class LoginComponent {
  constructor(private api: ApiService) {}
  login(username: string, password: string) {
    this.api.login(username, password).subscribe(token => {
      localStorage.setItem('token', token);
    });
  }
}