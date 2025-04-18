@Service
public class InventoryService {
    @Autowired private ItemRepository repo;
    public Item addItem(Item item) {
        return repo.save(item);
    }
    public List<Item> listAll() {
        return repo.findAll();
    }
}