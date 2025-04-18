@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {
    @Autowired private AppointmentService service;
    @PostMapping
    public ResponseEntity<Appointment> book(@RequestBody Appointment a) {
        return ResponseEntity.ok(service.book(a));
    }
    @GetMapping("/{email}")
    public ResponseEntity<List<Appointment>> get(@PathVariable String email) {
        return ResponseEntity.ok(service.getByPatient(email));
    }
}