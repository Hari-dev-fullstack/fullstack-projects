import { Component } from '@angular/core';
import { ApiService } from '../services/api.service';
@Component({ selector: 'app-register', template: '<h2>Register</h2>' })
export class RegisterComponent {
  constructor(private api: ApiService) {}
  register(user: any) {
    this.api.register(user).subscribe();
  }
}