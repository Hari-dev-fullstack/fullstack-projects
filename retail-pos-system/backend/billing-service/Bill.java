@Entity
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cashier;
    private double totalAmount;
    private LocalDateTime timestamp;
    private String paymentMode; // CASH, CARD, UPI
    // Getters and Setters
}