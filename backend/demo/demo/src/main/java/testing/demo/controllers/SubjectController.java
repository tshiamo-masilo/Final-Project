package testing.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import testing.demo.entities.Subject;
import testing.demo.services.SubjectService;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    private SubjectService service;

    public SubjectController(SubjectService service) {
        this.service = service;
    }

    @PostMapping("/save")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public Subject saveSubject(@RequestBody Subject subject) {
        return service.saveSubject(subject);
    }

    @GetMapping("/get/{id}")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public Subject getSubjectById(@PathVariable Long id) {
        return service.getSubjectById(id);
    }

    @GetMapping("/getAll")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public List<Subject> getAllSubject() {
        return service.getSubjects();
    }

    @DeleteMapping("/delete/{id}")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public String deleteSubjectById(@PathVariable Long id) {
        return service.deleteSubjectById(id);
    }

    @DeleteMapping("/deleteAll")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public String deleteAllSubject() {
        return service.deleteAllSubjects();
    }

    @PutMapping("/update")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public Subject updateSubject(@RequestBody Subject subject) {
        return service.updateSubject(subject);
    }

}
