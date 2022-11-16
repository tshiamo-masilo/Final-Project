package testing.demo.Controllers;

import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testing.demo.Services.RequirementsService;
import testing.demo.model.Requirements;

import java.util.List;

@RestController
@RequestMapping("/requirements")
public class RequirementsController {
    @Autowired
    private RequirementsService repository;
    @PostMapping("/save")
    @CrossOrigin
    public Requirements saveRequirements(Requirements requirements){
        return repository.saveRequirements(requirements);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Requirements> getRequirementsById(@PathVariable int id){
        return ResponseEntity.ok(repository.getRequirementsById(id));
    }
    @GetMapping("/getAll")
    public ResponseEntity<List> getUser(){
        return ResponseEntity.ok(repository.getAllRequirements());
    }
    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<String> deleteRequirementById(@PathVariable int id){
        return  ResponseEntity.ok(repository.deleteRequirementsById(id));
    }
    @DeleteMapping("/deleteAll")
    public  ResponseEntity<String> deleteRequirements(){
        return  ResponseEntity.ok(repository.deleteAllRequirements());
    }
    @PutMapping("/update")
    public  ResponseEntity<Requirements> updateRequirement(@RequestBody Requirements requirements){
        return  ResponseEntity.ok(repository.updateRequirements(requirements));
    }


//    @GetMapping("/get/{id}")
//    public Requirements getRequirementsById( @PathVariable int id){
//
//    }
//    @GetMapping("/getAll")
//    public List<Requirements> getAllRequirements(){
//
//        return
//    }
//    @DeleteMapping("/delete/{id}")
//    public String deleteRequirementsById(@PathVariable int id){
//
//        return repository.deleteRequirementsById( id);
//    }
//    @DeleteMapping("/deleteAll")
//    public String deleteAllRequirements(){
//        return repository.deleteAllRequirements();
//    }
//    @PutMapping("/update")
//    public Requirements updateRequirements(Requirements requirements){
//        return
//    }
}
