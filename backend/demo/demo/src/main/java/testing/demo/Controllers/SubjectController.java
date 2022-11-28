package testing.demo.controllers;


import org.springframework.web.bind.annotation.*;

import testing.demo.services.JSubjectService;
import testing.demo.entities.JuniorSchoolSubject;

import java.util.List;

@RestController
@RequestMapping("/junior/subject")
public class SubjectController {

    private JSubjectService service;

    public SubjectController(JSubjectService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public JuniorSchoolSubject saveSubject(@RequestBody JuniorSchoolSubject JSubject) {
        return service.saveSubject(JSubject);
    }

    @GetMapping("/get/{id}")
    public JuniorSchoolSubject getSubjectById(@PathVariable Long id) {
        return service.getSubjectById(id);
    }

    @GetMapping("/getAll")
    public List<JuniorSchoolSubject> getAllSubject() {
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
