@Service
public class TransactionService {
    @Autowired private TransactionRepository repo;
    public Transaction transfer(Transaction tx) {
        tx.setTimestamp(LocalDateTime.now());
        tx.setStatus("SUCCESS");
        return repo.save(tx);
    }
    public List<Transaction> history(String accNo) {
        return repo.findByFromAccOrToAcc(accNo, accNo);
    }
}