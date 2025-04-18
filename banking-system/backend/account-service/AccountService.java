@Service
public class AccountService {
    @Autowired private AccountRepository repo;
    public Account open(Account acc) {
        acc.setAccountNumber(UUID.randomUUID().toString());
        return repo.save(acc);
    }
    public Account get(String email) {
        return repo.findByEmail(email).orElseThrow();
    }
}