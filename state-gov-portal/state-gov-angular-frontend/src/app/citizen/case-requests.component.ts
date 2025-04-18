import { Component } from '@angular/core';
import { ApiService } from '../services/api.service';
@Component({ selector: 'app-case-requests', template: '<h2>My Cases</h2>' })
export class CaseRequestsComponent {
  cases: any[] = [];
  constructor(private api: ApiService) {
    this.api.getMyCases().subscribe(data => this.cases = data);
  }
}