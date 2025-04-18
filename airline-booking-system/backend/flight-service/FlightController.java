@RestController
@RequestMapping("/api/flights")
public class FlightController {
    @Autowired private FlightService service;
    @PostMapping
    public ResponseEntity<Flight> add(@RequestBody Flight f) {
        return ResponseEntity.ok(service.addFlight(f));
    }
    @GetMapping("/search")
    public ResponseEntity<List<Flight>> search(@RequestParam String from, @RequestParam String to, @RequestParam String date) {
        return ResponseEntity.ok(service.search(from, to, LocalDate.parse(date)));
    }
}