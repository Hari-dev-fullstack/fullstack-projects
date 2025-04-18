@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired private AuthService authService;
    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        return ResponseEntity.ok(authService.register(user));
    }
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Map<String, String> creds) {
        return ResponseEntity.ok(authService.login(creds.get("username"), creds.get("password")));
    }
}