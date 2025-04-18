@Service
public class AuthService {
    @Autowired private UserRepository repo;
    @Autowired private PasswordEncoder encoder;
    public User register(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }
    public String login(String email, String password) {
        User user = repo.findByEmail(email).orElseThrow();
        if (encoder.matches(password, user.getPassword())) {
            return JwtUtil.generateToken(user);
        } else throw new RuntimeException("Invalid credentials");
    }
}