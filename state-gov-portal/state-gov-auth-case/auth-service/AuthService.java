@Service
public class AuthService {
    @Autowired private UserRepository userRepository;
    @Autowired private PasswordEncoder passwordEncoder;
    public User register(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
    public String login(String username, String password) {
        User user = userRepository.findByUsername(username)
            .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        if (passwordEncoder.matches(password, user.getPassword())) {
            return JwtUtil.generateToken(user);
        } else {
            throw new BadCredentialsException("Invalid credentials");
        }
    }
}