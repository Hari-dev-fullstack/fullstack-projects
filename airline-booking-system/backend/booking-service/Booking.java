@Entity
public class Booking {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private Long flightId;
    private int seats;
    private String status; // BOOKED, CANCELLED
    // Getters and Setters
}