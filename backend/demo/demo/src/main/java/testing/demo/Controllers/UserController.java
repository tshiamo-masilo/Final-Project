package testing.demo.controllers;

import org.springframework.web.bind.annotation.*;

import lombok.var;
import net.bytebuddy.utility.RandomString;

import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Arrays;
import java.util.HashSet;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import testing.demo.controllers.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;

<<<<<<< HEAD
import testing.demo.model.ApiResponse;
import testing.demo.model.User;
import testing.demo.Services.UserService;
=======
import testing.demo.services.UserService;
import testing.demo.dtos.RegistrationDto;
import testing.demo.entities.ApiResponse;
import testing.demo.entities.Role;
import testing.demo.entities.User;
>>>>>>> db9abb4a47de7be7c0cc363c5cf5ab39f622ccc7

@RestController
@RequestMapping("/user")
public class UserController {
<<<<<<< HEAD
=======

    private static final String MessagingException = null;

    private static final String UnsupportedEncodingException = null;

    

>>>>>>> db9abb4a47de7be7c0cc363c5cf5ab39f622ccc7
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
     * @return ApiResponse<User>
     */
    @GetMapping("/{email}")
    public ApiResponse<User> getUser(@PathVariable String email, Principal principal) {
        // Check role before responding to request
        return new ApiResponse<User>(HttpStatus.OK, principal.toString(), userService.getUserByEmail(email));
    }

    /**
     * 
     * @param user
     * @return ApiResponse<User>
     */
    @PostMapping("")
    @CrossOrigin
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
