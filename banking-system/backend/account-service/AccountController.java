@RestController
@RequestMapping("/api/account")
public class AccountController {
    @Autowired private AccountService service;
    @PostMapping("/open")
    public ResponseEntity<Account> open(@RequestBody Account acc) {
        return ResponseEntity.ok(service.open(acc));
    }
    @GetMapping("/{email}")
    public ResponseEntity<Account> get(@PathVariable String email) {
        return ResponseEntity.ok(service.get(email));
    }
}