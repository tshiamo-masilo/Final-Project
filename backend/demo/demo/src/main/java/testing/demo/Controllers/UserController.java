package testing.demo.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

import testing.demo.services.UserService;
import testing.demo.dtos.RegistrationDto;
import testing.demo.entities.ApiResponse;
import testing.demo.entities.Role;
import testing.demo.entities.User;

@RestController
@RequestMapping("/user")
public class UserController<ResetPasswordData> {

    

    private static final String  REDIREC_LOGIN = "redirct:/login";
    private static final String M_STRING = "resetPasswordMsg";

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("request")
    public String resetPassword(final ResetPasswordData forgotPasswordForm , RedirectAttributes redirAttr ){
        return "";
    }
    @GetMapping("changeP")
    public String changePassword(@RequestParam(required = false) String token, final RedirectAttributes redirAttr, final Model model){
        return "";
    }
    @PostMapping("changeP")
    public String changePassword( final ResetPasswordData data, final Model model){
        return "";
    }
    

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
