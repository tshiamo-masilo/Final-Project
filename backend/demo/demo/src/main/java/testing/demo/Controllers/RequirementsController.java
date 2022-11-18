package testing.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import testing.demo.model.Requirements;
import testing.demo.Services.RequirementsService;

import java.util.List;

@RestController
@RequestMapping("/requirements")
public class RequirementsController {
    @Autowired
    private RequirementsService repository;

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

}
