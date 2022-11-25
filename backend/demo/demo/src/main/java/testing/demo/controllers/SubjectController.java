package testing.demo.Controllers;

import org.springframework.web.bind.annotation.*;

import testing.demo.services.JSubjectService;
import testing.demo.entities.JSubject;

import java.util.List;

@RestController
@RequestMapping("/junior/subject")
public class SubjectController {

    private JSubjectService service;

    public SubjectController(JSubjectService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public JSubject saveSubject(@RequestBody JSubject JSubject) {
        return service.saveSubject(JSubject);
    }

    @GetMapping("/get/{id}")
    public JSubject getSubjectById(@PathVariable Long id) {
        return service.getSubjectById(id);
    }

    @GetMapping("/getAll")
    public List<JSubject> getAllSubject() {
        return service.getSubjects();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSubjectById(@PathVariable Long id) {
        return service.deleteSubjectById(id);
    }

    @DeleteMapping("/deleteAll")
    public String deleteAllSubject() {
        return service.deleteAllSubjects();
    }


}
