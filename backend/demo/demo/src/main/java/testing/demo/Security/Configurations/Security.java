package testing.demo.security.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import lombok.var;
<<<<<<< HEAD
import testing.demo.Security.Handler.AuthSuccesHandler;
import testing.demo.Services.UserDetailService;
import testing.demo.model.Role;
import testing.demo.security.filters.JsonObjectAuthenticationFilter;
=======
import testing.demo.entities.Role;
import testing.demo.security.filters.AuthorizationFilter;
import testing.demo.security.filters.JsonObjectAuthenticationFilter;
import testing.demo.security.handler.AuthSuccesHandler;
import testing.demo.services.UserDetailService;
>>>>>>> db9abb4a47de7be7c0cc363c5cf5ab39f622ccc7

@Configuration
public class Security {
    @Autowired
    private AuthenticationManager authenticationManager;

    private final AuthSuccesHandler authSuccesHandler;
    private final UserDetailService userDetailService;
    private String secretKey;

    public Security(AuthSuccesHandler authSuccesHandler, UserDetailService userDetailService,
            @Value("${jwt.secretKey}") String secretKey) {
        this.authSuccesHandler = authSuccesHandler;
        this.userDetailService = userDetailService;
        this.secretKey = secretKey;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .cors()
                .and()
                .csrf()
                .disable()
                .authorizeHttpRequests((auth) -> {
                    try {
                        auth
                                .antMatchers("user").hasAnyRole(Role.ADMIN.name(), Role.USER.name())
                                .antMatchers("admin").hasRole(Role.ADMIN.name())
                                .anyRequest().permitAll()
                                .and()
                                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                                .and()
                                .addFilter(authenticationFilter())
                                .addFilter(new testing.demo.Security.Filters.AuthorizationFilter(authenticationManager, userDetailService, secretKey))
                                .exceptionHandling()
                                .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED));
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                })
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }

    @Bean
    public JsonObjectAuthenticationFilter authenticationFilter() throws Exception {
        var filter = new JsonObjectAuthenticationFilter();
        filter.setAuthenticationManager(authenticationManager);
        filter.setAuthenticationSuccessHandler(authSuccesHandler);
        return filter;
    }

    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", new CorsConfiguration().applyPermitDefaultValues());
        return source;
    }
}