@RestController
@RequestMapping("/api/bills")
public class BillingController {
    @Autowired private BillingService service;
    @PostMapping
    public ResponseEntity<Bill> create(@RequestBody Bill bill) {
        return ResponseEntity.ok(service.create(bill));
    }
    @GetMapping("/{cashier}")
    public ResponseEntity<List<Bill>> get(@PathVariable String cashier) {
        return ResponseEntity.ok(service.getByCashier(cashier));
    }
}