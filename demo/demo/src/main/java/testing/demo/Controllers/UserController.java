package testing.demo.Controllers;

import org.springframework.web.bind.annotation.*;

import lombok.var;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import testing.demo.Services.UserService;
import testing.demo.model.ApiResponse;
import testing.demo.model.User;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

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
}
