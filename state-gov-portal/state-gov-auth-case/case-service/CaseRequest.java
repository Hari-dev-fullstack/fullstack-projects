@Entity
public class CaseRequest {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String citizen;
    private String subject;
    private String description;
    private String status; // OPEN, IN_PROGRESS, CLOSED
    private LocalDateTime createdAt;
    // Getters and Setters
}