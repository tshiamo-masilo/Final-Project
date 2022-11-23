package testing.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testing.demo.Repository.StudentApplicationRepo;
import testing.demo.services.ApplicationService;
import testing.demo.entities.Requirements;
import testing.demo.entities.StudentApplication;

import java.util.List;

@RestController("/studentApplication")
public class StudentApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @PostMapping("/save")
    public StudentApplication addStudentApplication(@RequestBody StudentApplication studentApplication) {
        return applicationService.saveStudentApplication(studentApplication);
    }

    @GetMapping("/get/{Id}")
    public StudentApplication getStudentApplicationById(@PathVariable Long Id) {
        return applicationService.getStudentApplicationById(Id);
    }

    @GetMapping("/getAll")
    public List<StudentApplication> getAllStudentApplication() {
        return applicationService.getAllStudentApplication();
    }

    @GetMapping("/delete/{Id}")
    public String deleteStudentApplicationById(@PathVariable Long Id) {
        return applicationService.deleteStudentApplicationById(Id);
    }

    @GetMapping("/delete")
    public String deleteAllStudentApplication() {
        return applicationService.deleteStudentApplication();
    }

    @PutMapping("/update")
    public ResponseEntity<StudentApplication> updateRequirement(@RequestBody StudentApplication studentApplicatio) {
        return ResponseEntity.ok(applicationService.updateStudentApplication(studentApplicatio));
    }
}
