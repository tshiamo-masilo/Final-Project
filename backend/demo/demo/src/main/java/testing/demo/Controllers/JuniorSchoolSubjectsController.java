package testing.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testing.demo.entities.JuniorSchoolSubject;
import testing.demo.services.JuniorSchoolSubjectsService;

import java.util.List;

@RestController
@RequestMapping("/junior")
public class JuniorSchoolSubjectsController {
    @Autowired
    private JuniorSchoolSubjectsService repository;

    @PostMapping("/save")
    public ResponseEntity<JuniorSchoolSubject> saveJSubject(@RequestBody JuniorSchoolSubject subject) {
        return new ResponseEntity<>(repository.saveSubject(subject), HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<JuniorSchoolSubject> getJSubjectById(@PathVariable Long id) {
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
    public ResponseEntity<String> deleteJSubject() {
        return ResponseEntity.ok(repository.deleteAllSubjects());
    }
}
