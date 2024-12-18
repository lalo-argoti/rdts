import org.springframework.security.web.filter.OncePerRequestFilter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtAuthenticationFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        // Aquí puedes añadir la lógica de filtrado (validación de JWT, por ejemplo)
        filterChain.doFilter(request, response);  // Continuar con el siguiente filtro o controlador
    }
}
