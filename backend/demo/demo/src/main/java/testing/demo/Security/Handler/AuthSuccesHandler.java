package testing.demo.Security.Handler;

import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.var;
import testing.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Value;

@Component
public class AuthSuccesHandler extends SimpleUrlAuthenticationSuccessHandler {

    private final int expirationTime;
    private final String secretKey;
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final UserService userService;

    public AuthSuccesHandler(@Value("${jwt.expiration}") int expirationTime,
            @Value("${jwt.secretKey}") String secretKey, UserService userService) {
        this.expirationTime = expirationTime;
        this.secretKey = secretKey;
        this.userService = userService;
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
            Authentication authentication) throws IOException, ServletException {
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();

        var user = userService.getUserByUsername(userDetails.getUsername());
        var token = JWT.create()
                .withSubject(user.getEmail())
                .withExpiresAt(Instant
                        .ofEpochMilli(
                                ZonedDateTime.now(ZoneId.systemDefault()).toInstant().toEpochMilli() + expirationTime))
                .sign(Algorithm.HMAC256(secretKey));
        response.addHeader("Authorization", "Bearer " + token);
        response.addHeader("Content-Type", "application/json");
        response.getWriter().write(objectMapper.writeValueAsString(TokenResponse.of(token, null)));
    }
}
