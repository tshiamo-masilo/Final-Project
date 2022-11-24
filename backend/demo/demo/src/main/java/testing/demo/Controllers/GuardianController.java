package testing.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testing.demo.services.GuardianService;


@RestController
@RequestMapping("guardian")
public class GuardianController {
    
    private GuardianService service;

    // @PostMapping("/save")
    // public GuardianRepoice getGuardianById(id){
    //     ;
    // }
    // @GetMapping("/getAll")
    // public List<Guardian> getAllGuardian(){
    //     return service.getAllGuardian();
    // }

    @DeleteMapping("/delete/{id}")
    public String deleteRequirementById(@PathVariable int id){
        return service.deleteGuardianById(id);
    }
    @DeleteMapping("/deleteAll")
    public String deleteAllGuardian(){
        return service.deleteAllGuardian();
    }
    // @PutMapping("/update")
    // public Guardian updateGuardian(Guardian guardian) {
    //     return service.updateGuardian(guardian);
    // }
}
