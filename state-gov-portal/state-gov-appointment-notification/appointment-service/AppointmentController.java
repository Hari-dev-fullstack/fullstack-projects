@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {
    @Autowired private AppointmentService service;
    @PostMapping("/book")
    public ResponseEntity<Appointment> book(@RequestBody Appointment appt) {
        return ResponseEntity.ok(service.book(appt));
    }
    @GetMapping("/citizen/{name}")
    public ResponseEntity<List<Appointment>> getByCitizen(@PathVariable String name) {
        return ResponseEntity.ok(service.getByCitizen(name));
    }
    @GetMapping("/department")
    public ResponseEntity<List<Appointment>> getByDeptDate(@RequestParam String dept, @RequestParam String date) {
        return ResponseEntity.ok(service.getByDeptAndDate(dept, LocalDate.parse(date)));
    }
    @PostMapping("/update/{id}")
    public ResponseEntity<Appointment> update(@PathVariable Long id, @RequestParam String status) {
        return ResponseEntity.ok(service.updateStatus(id, status));
    }
}