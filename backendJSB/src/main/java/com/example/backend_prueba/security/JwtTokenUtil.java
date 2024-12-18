import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.Claims;
import java.util.Date;

public class JwtTokenUtil {
    private String secretKey = "yourSecretKey";

    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))  // 10 horas
                .signWith(SignatureAlgorithm.HS256, secretKey)
                .compact();
    }

    public String parseToken(String token) {
        Claims claims = Jwts.parserBuilder() // Se utiliza parserBuilder()
                .setSigningKey(secretKey)
                .build()  // Se agrega build() al final
                .parseClaimsJws(token)
                .getBody();
        return claims.getSubject();  // Devuelve el "subject" del token
    }
}
