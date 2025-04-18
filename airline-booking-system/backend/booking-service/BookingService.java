@Service
public class BookingService {
    @Autowired private BookingRepository repo;
    public Booking book(Booking b) {
        b.setStatus("BOOKED");
        return repo.save(b);
    }
    public List<Booking> myBookings(String email) {
        return repo.findByEmail(email);
    }
}