@Service
public class BillingService {
    @Autowired private BillRepository repo;
    public Bill create(Bill bill) {
        bill.setTimestamp(LocalDateTime.now());
        return repo.save(bill);
    }
    public List<Bill> getByCashier(String name) {
        return repo.findByCashier(name);
    }
}