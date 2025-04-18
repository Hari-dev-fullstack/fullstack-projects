@RestController
@RequestMapping("/api/cases")
public class CaseController {
    @Autowired private CaseService service;
    @PostMapping("/submit")
    public ResponseEntity<CaseRequest> submit(@RequestBody CaseRequest req) {
        return ResponseEntity.ok(service.submitCase(req));
    }
    @GetMapping("/citizen/{username}")
    public ResponseEntity<List<CaseRequest>> getByCitizen(@PathVariable String username) {
        return ResponseEntity.ok(service.getCases(username));
    }
    @PostMapping("/update/{id}")
    public ResponseEntity<CaseRequest> update(@PathVariable Long id, @RequestParam String status) {
        return ResponseEntity.ok(service.updateStatus(id, status));
    }
}