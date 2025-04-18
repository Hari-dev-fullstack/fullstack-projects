@Entity
public class Appointment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String patientEmail;
    private String doctorName;
    private LocalDateTime slot;
    private String status; // SCHEDULED, COMPLETED, CANCELLED
    // Getters and Setters
}