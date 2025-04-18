public interface CaseRepository extends JpaRepository<CaseRequest, Long> {
    List<CaseRequest> findByCitizen(String citizen);
}