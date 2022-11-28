package testing.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testing.demo.entities.HighSchoolSubject;
import testing.demo.services.HighSchoolSubjectsService;

import java.util.List;

@RestController
@RequestMapping("/high")
public class HighSchoolSubjectsController {
    @Autowired
    private HighSchoolSubjectsService repository;

    @PostMapping("/save")
    public ResponseEntity<HighSchoolSubject> saveHSubject(@RequestBody HighSchoolSubject subject) {
        return new ResponseEntity<>(repository.saveSubject(subject), HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<HighSchoolSubject> getHSubjectById(@PathVariable Long id) {
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
