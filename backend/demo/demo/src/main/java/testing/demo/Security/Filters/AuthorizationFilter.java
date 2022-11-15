package testing.demo.Security.Filters;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.beans.factory.annotation.Value;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import lombok.var;
import testing.demo.Services.UserDetailService;

public class AuthorizationFilter extends BasicAuthenticationFilter {

    private static final String TOKEN_PREFIX = "Bearer ";
    private final UserDetailService userDetailService;

    @Value("${jwt.secretKey}")
    private final String secretKey;

    public AuthorizationFilter(AuthenticationManager authenticationManager,
            UserDetailService userDetailsService, String secretKey) {
        super(authenticationManager);
        this.userDetailService = userDetailsService;
        this.secretKey = secretKey;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        var token = getAuthentication(request);

        if (token == null) {
            chain.doFilter(request, response);
            return;
        }

        SecurityContextHolder.getContext().setAuthentication(token);
        chain.doFilter(request, response);
    }

    private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {
        var token = request.getHeader(HttpHeaders.AUTHORIZATION);

        if (token == null || !token.startsWith(TOKEN_PREFIX)) {
            return null;
        }

        var email = JWT.require(Algorithm.HMAC256(secretKey))
                .build()
                .verify(token.replace(TOKEN_PREFIX, ""))
                .getSubject();

        if (email == null)
            return null;

        var userDetail = userDetailService.loadUserByUsername(email);

        return new UsernamePasswordAuthenticationToken(userDetail.getUsername(), null, userDetail.getAuthorities());
    }
}
