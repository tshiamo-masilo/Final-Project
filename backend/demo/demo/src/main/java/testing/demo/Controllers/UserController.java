package testing.demo.controllers;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import lombok.var;
import java.security.Principal;
import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import testing.demo.dtos.RegistrationDto;
import testing.demo.entities.ApiResponse;
import testing.demo.entities.Role;
import testing.demo.services.UserService;
import testing.demo.entities.ApiResponse;
import testing.demo.entities.User;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;
    /**
     * @return ApiResponse
     */

    @GetMapping("")
    public ApiResponse<String> userEndpoint() {
        return new ApiResponse<String>(HttpStatus.OK, "Hello user", null);
    }

    /**
     * @return ApiResponse
     */
    @GetMapping("/{email}")
    public ApiResponse<User> getUser(@PathVariable String email, Principal principal) {
        // Check role before responding to request
        return new ApiResponse<User>(HttpStatus.OK, principal.toString(), userService.getUserByEmail(email));
    }

    /**
     *
     * @param registerationDto
     * @return ApiResponse<User>
     */
    @PostMapping("/addUser")
    public ApiResponse<User> registerUser(@RequestBody RegistrationDto registerationDto) {
        var user = userService.createUser(User.builder()
                .name(registerationDto.getName())
                .surname(registerationDto.getSurname())
                .username(registerationDto.getUsername())
                .email(registerationDto.getEmail())
                .password(passwordEncoder.encode(registerationDto.getPassword()))
                .roles(new HashSet<>(Arrays.asList(Role.USER)))
                .build());
        user.setEnabled(true);
        userService.createUser(user);
        return new ApiResponse<>(HttpStatus.OK, null, user);
    }
}
