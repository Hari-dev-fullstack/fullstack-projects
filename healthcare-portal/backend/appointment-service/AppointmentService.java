@Service
public class AppointmentService {
    @Autowired private AppointmentRepository repo;
    public Appointment book(Appointment a) {
        a.setStatus("SCHEDULED");
        return repo.save(a);
    }
    public List<Appointment> getByPatient(String email) {
        return repo.findByPatientEmail(email);
    }
}