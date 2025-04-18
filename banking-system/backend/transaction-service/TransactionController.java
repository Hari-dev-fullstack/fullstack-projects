@RestController
@RequestMapping("/api/transaction")
public class TransactionController {
    @Autowired private TransactionService service;
    @PostMapping("/transfer")
    public ResponseEntity<Transaction> transfer(@RequestBody Transaction tx) {
        return ResponseEntity.ok(service.transfer(tx));
    }
    @GetMapping("/history/{acc}")
    public ResponseEntity<List<Transaction>> history(@PathVariable String acc) {
        return ResponseEntity.ok(service.history(acc));
    }
}