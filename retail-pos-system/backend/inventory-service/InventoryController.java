@RestController
@RequestMapping("/api/items")
public class InventoryController {
    @Autowired private InventoryService service;
    @PostMapping
    public ResponseEntity<Item> add(@RequestBody Item item) {
        return ResponseEntity.ok(service.addItem(item));
    }
    @GetMapping
    public ResponseEntity<List<Item>> all() {
        return ResponseEntity.ok(service.listAll());
    }
}