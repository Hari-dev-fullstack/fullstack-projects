import { Component } from '@angular/core';
import { ApiService } from '../services/api.service';
@Component({ selector: 'app-appointment-booking', template: '<h2>Book Appointment</h2>' })
export class AppointmentBookingComponent {
  constructor(private api: ApiService) {}
  bookAppointment(appt: any) {
    this.api.bookAppointment(appt).subscribe();
  }
}