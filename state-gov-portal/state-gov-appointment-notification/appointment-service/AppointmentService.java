@Service
public class AppointmentService {
    @Autowired private AppointmentRepository repo;
    @Autowired private KafkaTemplate<String, String> kafka;
    public Appointment book(Appointment appt) {
        appt.setStatus("SCHEDULED");
        Appointment saved = repo.save(appt);
        kafka.send("appointment-events", "Appointment booked: " + saved.getId());
        return saved;
    }
    public List<Appointment> getByCitizen(String citizen) {
        return repo.findByCitizen(citizen);
    }
    public List<Appointment> getByDeptAndDate(String dept, LocalDate date) {
        return repo.findByDepartmentAndDate(dept, date);
    }
    public Appointment updateStatus(Long id, String status) {
        Appointment appt = repo.findById(id).orElseThrow();
        appt.setStatus(status);
        return repo.save(appt);
    }
}