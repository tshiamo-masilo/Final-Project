package testing.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

<<<<<<< HEAD
import testing.demo.model.Requirements;
import testing.demo.Services.RequirementsService;
=======
import testing.demo.entities.Requirements;
import testing.demo.services.RequirementsService;
>>>>>>> db9abb4a47de7be7c0cc363c5cf5ab39f622ccc7

import java.util.List;

@RestController
@RequestMapping("/requirements")
public class RequirementsController {
    @Autowired
    private RequirementsService repository;
<<<<<<< HEAD

    @PostMapping("/save")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public Requirements saveRequirements(@RequestBody Requirements requirements) {
        System.out.print("yiyo =============================="+requirements.getStream()+requirements.getMaths());
        return repository.saveRequirements(requirements);
    }

    @GetMapping("/get/{id}")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public ResponseEntity<Requirements> getRequirementsById(@PathVariable int id) {
        return ResponseEntity.ok(repository.getRequirementsById(id));
    }

    @GetMapping("/getAll")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public ResponseEntity<List> getUser() {
        return ResponseEntity.ok(repository.getAllRequirements());
    }

    @DeleteMapping("/delete/{id}")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public ResponseEntity<String> deleteRequirementById(@PathVariable Long id) {
        return ResponseEntity.ok(repository.deleteRequirementsById(id));
    }

    @DeleteMapping("/deleteAll")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public ResponseEntity<String> deleteRequirements() {
        return ResponseEntity.ok(repository.deleteAllRequirements());
    }

    @PutMapping("/update")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public ResponseEntity<Requirements> updateRequirement(@RequestBody Requirements requirements) {
        return ResponseEntity.ok(repository.updateRequirements(requirements));
    }

=======

    // @PostMapping("/save")
    // public ResponseEntity<Requirements> saveRequirements(Requirements
    // requirements) {
    // return new ResponseEntity<>(repository.saveRequirements(requirements),
    // HttpStatus.CREATED);
    // }

    // @GetMapping("/get/{id}")
    // public ResponseEntity<Requirements> getRequirementsById(@PathVariable int id)
    // {
    // return ResponseEntity.ok(repository.getRequirementsById(id));
    // }

    // @GetMapping("/getAll")
    // public ResponseEntity<List> getUser() {
    // return ResponseEntity.ok(repository.getAllRequirements());
    // }

    // @DeleteMapping("/delete/{id}")
    // public ResponseEntity<String> deleteRequirementById(@PathVariable int id) {
    // return ResponseEntity.ok(repository.deleteRequirementsById(id));
    // }

    // @DeleteMapping("/deleteAll")
    // public ResponseEntity<String> deleteRequirements() {
    // return ResponseEntity.ok(repository.deleteAllRequirements());
    // }

    // @PutMapping("/update")
    // public ResponseEntity<Requirements> updateRequirement(@RequestBody
    // Requirements requirements) {
    // return ResponseEntity.ok(repository.updateRequirements(requirements));
    // }

    // @GetMapping("/get/{id}")
    // public Requirements getRequirementsById( @PathVariable int id){
    //
    // }
    // @GetMapping("/getAll")
    // public List<Requirements> getAllRequirements(){
    //
    // return
    // }
    // @DeleteMapping("/delete/{id}")
    // public String deleteRequirementsById(@PathVariable int id){
    //
    // return repository.deleteRequirementsById( id);
    // }
    // @DeleteMapping("/deleteAll")
    // public String deleteAllRequirements(){
    // return repository.deleteAllRequirements();
    // }
    // @PutMapping("/update")
    // public Requirements updateRequirements(Requirements requirements){
    // return
    // }
>>>>>>> db9abb4a47de7be7c0cc363c5cf5ab39f622ccc7
}
