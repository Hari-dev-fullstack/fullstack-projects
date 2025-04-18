public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByCitizen(String citizen);
    List<Appointment> findByDepartmentAndDate(String department, LocalDate date);
}