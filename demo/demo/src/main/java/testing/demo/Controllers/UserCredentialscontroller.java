package testing.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testing.demo.Services.UserCredentialsService;
import testing.demo.Services.UserService;
import testing.demo.model.User;
import testing.demo.model.UserCredentials;

import java.util.List;

@RestController
@RequestMapping("/userCredentials")
public class UserCredentialsController {

    // @Autowired
    // private UserService userService;

    // @PostMapping("/saveUser")
    // public User savePerson(@RequestBody User userCredentials) {
    // return userService.createUser(userCredentials);
    // }

    // @GetMapping("/get/{id}")
    // public UserCredentials findPersonById(@PathVariable int id) {
    // return userCredentialsService.findPersonById(id);
    // }

    // @GetMapping("/getAll")
    // public List<UserCredentials> findPersonById() {
    // return userCredentialsService.getAllUser();
    // }

    // @DeleteMapping("/delete/{id}")
    // public String deleteById(@PathVariable int id) {
    // return userCredentialsService.deleteById(id);
    // }
}
