@Entity
public class Flight {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String flightNumber;
    private String from;
    private String to;
    private LocalDate departureDate;
    private int seatsAvailable;
    // Getters and Setters
}