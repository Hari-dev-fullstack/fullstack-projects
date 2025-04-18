@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired private OrderService service;
    @PostMapping
    public ResponseEntity<Order> place(@RequestBody Order o) {
        return ResponseEntity.ok(service.place(o));
    }
    @GetMapping("/{email}")
    public ResponseEntity<List<Order>> my(@PathVariable String email) {
        return ResponseEntity.ok(service.getMyOrders(email));
    }
}