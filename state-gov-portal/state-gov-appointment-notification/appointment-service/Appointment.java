@Entity
public class Appointment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String citizen;
    private String department;
    private LocalDate date;
    private String timeSlot;
    private String status; // SCHEDULED, COMPLETED, CANCELLED
    // Getters and Setters
}