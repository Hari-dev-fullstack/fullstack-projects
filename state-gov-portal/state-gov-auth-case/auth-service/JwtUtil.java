public class JwtUtil {
    private static final String SECRET = "govSecret";
    public static String generateToken(User user) {
        return Jwts.builder()
            .setSubject(user.getUsername())
            .claim("role", user.getRole())
            .setIssuedAt(new Date())
            .setExpiration(new Date(System.currentTimeMillis() + 86400000))
            .signWith(SignatureAlgorithm.HS256, SECRET)
            .compact();
    }
}