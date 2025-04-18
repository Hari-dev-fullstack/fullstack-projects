@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    @Autowired private BookingService service;
    @PostMapping
    public ResponseEntity<Booking> book(@RequestBody Booking b) {
        return ResponseEntity.ok(service.book(b));
    }
    @GetMapping("/{email}")
    public ResponseEntity<List<Booking>> view(@PathVariable String email) {
        return ResponseEntity.ok(service.myBookings(email));
    }
}