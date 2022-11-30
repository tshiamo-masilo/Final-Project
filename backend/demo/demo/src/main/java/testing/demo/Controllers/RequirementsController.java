package testing.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testing.demo.entities.Requirements;
import testing.demo.services.RequirementsServices;

import java.util.List;

@RestController
@RequestMapping("/requirements")
public class RequirementsController {
    @Autowired
    private RequirementsServices repository;

    @PostMapping("/save")
    public ResponseEntity<Requirements> saveRequirements(Requirements requirements) {
        return new ResponseEntity<>(repository.saveRequirement(requirements), HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Requirements> getRequirementsById(@PathVariable Long id) {
        return ResponseEntity.ok(repository.findRequirementsById(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List> getUser() {
        return ResponseEntity.ok(repository.getAllRequirements());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteRequirementById(@PathVariable Long id) {
        return ResponseEntity.ok(repository.deleteRequirementsById(id));
    }

    @DeleteMapping("/deleteAll")
    public ResponseEntity<String> deleteRequirements() {
        return ResponseEntity.ok(repository.deleteAllRequirements());
    }



}
