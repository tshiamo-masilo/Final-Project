package testing.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testing.demo.entities.Subjects;
import testing.demo.services.SubjectsService;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectsController {
    @Autowired
    private SubjectsService repository;

    @PostMapping("/save")
    public ResponseEntity<Subjects> saveHSubject(@RequestBody Subjects subject) {
        return new ResponseEntity<>(repository.saveSubject(subject), HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Subjects> getHSubjectById(@PathVariable Long id) {
        return ResponseEntity.ok(repository.getSubjectById(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List> getUser() {
        return ResponseEntity.ok(repository.getAllSubjects());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteRequirementById(@PathVariable Long id) {
        return ResponseEntity.ok(repository.deleteSubjectById(id));
    }

    @DeleteMapping("/deleteAll")
    public ResponseEntity<String> deleteHSubject() {
        return ResponseEntity.ok(repository.deleteAllSubjects());
    }


}
