@Entity
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerEmail;
    private LocalDateTime orderDate;
    private String status; // PLACED, SHIPPED, DELIVERED
    // Getters and Setters
}