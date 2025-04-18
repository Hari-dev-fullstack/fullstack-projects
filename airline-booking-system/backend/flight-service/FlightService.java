@Service
public class FlightService {
    @Autowired private FlightRepository repo;
    public Flight addFlight(Flight f) { return repo.save(f); }
    public List<Flight> search(String from, String to, LocalDate date) {
        return repo.findByFromAndToAndDepartureDate(from, to, date);
    }
}