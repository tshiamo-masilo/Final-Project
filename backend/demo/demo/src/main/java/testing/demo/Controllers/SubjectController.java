package testing.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import testing.demo.model.Subject;
import testing.demo.Services.SubjectService;

import java.util.List;

@RestController
@RequestMapping("/subject")
@CrossOrigin
public class SubjectController {
    @Autowired
    private SubjectService service;

    @PostMapping("/save")
    public Subject saveSubject(@RequestBody Subject subject) {
        return service.saveSubject(subject);
    }

    @GetMapping("/get/{id}")
    public Subject getSubjectById(@PathVariable Long id) {
        return service.getSubjectById(id);
    }

    @GetMapping("/getAll")
    public List<Subject> getAllSubject() {
        return service.getSubjects();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSubjectById(Long id) {
        return service.deleteSubjectById(id);
    }

    @DeleteMapping("/deleteAll")
    public String deleteAllSubject() {
        return service.deleteAllSubjects();
    }

    @PutMapping("/update")
    public Subject updateSubject(@RequestBody Subject subject) {
        return service.updateSubject(subject);
    }

}
