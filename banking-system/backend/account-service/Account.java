@Entity
public class Account {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String accountNumber;
    private double balance;
    // Getters and Setters
}