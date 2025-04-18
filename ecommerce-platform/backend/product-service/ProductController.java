@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired private ProductService service;
    @PostMapping
    public ResponseEntity<Product> add(@RequestBody Product p) {
        return ResponseEntity.ok(service.addProduct(p));
    }
    @GetMapping
    public ResponseEntity<List<Product>> all() {
        return ResponseEntity.ok(service.getAll());
    }
}