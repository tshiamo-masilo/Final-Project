package testing.demo;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.var;
import testing.demo.services.UserService;
import testing.demo.entities.Role;
import testing.demo.entities.User;

@Component
@RequiredArgsConstructor
public class InitUsers implements CommandLineRunner {
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        if (!userService.findUserByEmail("admin@test.com").isPresent()) {
            var u = userService.createUser(User.builder()
                    .name("Admin")
                    .surname("Admin")
                    .username("admin")
                    .email("admin@test.com")
                    .password(passwordEncoder.encode("test123"))
                    .roles(new HashSet<>(Arrays.asList(Role.ADMIN, Role.USER)))
                    .build());
            u.setEnabled(true);
            userService.createUser(u);
        }
        if (!userService.findUserByEmail("user@test.com").isPresent()) {
            var u = userService.createUser(User.builder()
                    .name("User")
                    .surname("User")
                    .username("user")
                    .email("user@test.com")
                    .password(passwordEncoder.encode("test123"))
                    .roles(new HashSet<>(Arrays.asList(Role.USER)))
                    .build());
            u.setEnabled(true);
            userService.createUser(u);
        }
    }
}
