@Service
public class CaseService {
    @Autowired private CaseRepository repo;
    @Autowired private KafkaTemplate<String, String> kafka;
    public CaseRequest submitCase(CaseRequest req) {
        req.setStatus("OPEN");
        req.setCreatedAt(LocalDateTime.now());
        CaseRequest saved = repo.save(req);
        kafka.send("case-events", "Case submitted: " + saved.getId());
        return saved;
    }
    public List<CaseRequest> getCases(String citizen) {
        return repo.findByCitizen(citizen);
    }
    public CaseRequest updateStatus(Long id, String status) {
        CaseRequest caseReq = repo.findById(id).orElseThrow();
        caseReq.setStatus(status);
        return repo.save(caseReq);
    }
}