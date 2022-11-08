package testing.demo.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testing.demo.Services.UserCredentialsService;
import testing.demo.model.Admin;
import testing.demo.model.UserCredentials;

import java.util.List;

@RestController
@RequestMapping("/userCredentials")

public class UserCredentialscontroller {

    @Autowired
    private UserCredentialsService userCredentialsService;



    @PostMapping("/saveUser")
    public UserCredentials  savePerson(@RequestBody UserCredentials userCredentials){
        return userCredentialsService.savePerson(userCredentials) ;
    }

    @GetMapping("/get/{id}")
    public UserCredentials findPersonById(@PathVariable int id){
        return userCredentialsService.findPersonById(id);
    }

    @GetMapping("/getAll")
    public List<UserCredentials> findPersonById(){
        return userCredentialsService.getAllUser();
    }


    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable int id){
        return userCredentialsService.deleteById(id);

    }
}
