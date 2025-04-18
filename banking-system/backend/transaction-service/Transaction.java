@Entity
public class Transaction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fromAcc;
    private String toAcc;
    private double amount;
    private LocalDateTime timestamp;
    private String status;
    // Getters and Setters
}