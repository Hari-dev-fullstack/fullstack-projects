@Service
public class ProductService {
    @Autowired private ProductRepository repo;
    public Product addProduct(Product p) {
        return repo.save(p);
    }
    public List<Product> getAll() {
        return repo.findAll();
    }
}