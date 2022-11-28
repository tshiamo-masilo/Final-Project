package testing.demo.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import testing.demo.services.GuardianService;
import testing.demo.entities.*;

import java.util.List;
@RestController
@RequestMapping("guardian")
public class GuardianController {
    private GuardianService service;

    @PostMapping("/save")
    public Guardian saveGuardian(@RequestBody Guardian guardian){
        return service.saveGuardian(guardian);
    }
    @GetMapping("/get/{id}")
    public Guardian getGuardianById(@PathVariable int id){
        return service.getGuardianById(id);
    }
    @GetMapping("/getAll")
    public List<Guardian> getAllGuardian(){
        return service.getAllGuardian();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteRequirementById(@PathVariable int id){
        return service.deleteGuardianById(id);
    }
    @DeleteMapping("/deleteAll")
    public String deleteAllGuardian(){
        return service.deleteAllGuardian();
    }
    @PutMapping("/update")
    public Guardian updateGuardian(Guardian guardian) {
        return service.updateGuardian(guardian);
    }
}
