package testing.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import testing.demo.model.Subject;
import testing.demo.Services.SubjectService;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    private SubjectService service;

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
