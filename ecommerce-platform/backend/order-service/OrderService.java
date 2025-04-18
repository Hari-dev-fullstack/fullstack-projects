@Service
public class OrderService {
    @Autowired private OrderRepository repo;
    public Order place(Order o) {
        o.setOrderDate(LocalDateTime.now());
        o.setStatus("PLACED");
        return repo.save(o);
    }
    public List<Order> getMyOrders(String email) {
        return repo.findByCustomerEmail(email);
    }
}