@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired private AuthService auth;
    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        return ResponseEntity.ok(auth.register(user));
    }
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Map<String, String> body) {
        return ResponseEntity.ok(auth.login(body.get("email"), body.get("password")));
    }
}