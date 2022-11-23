package testing.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import testing.demo.entities.School;
import testing.demo.services.SchoolService;

import java.util.List;

@RestController
@RequestMapping("/school")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @PostMapping("/save")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public School saveSchool(@RequestBody School school) {

        return schoolService.saveSchool(school);
    }

    @GetMapping("/get/{id}")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public School findSchoolById(@PathVariable Long id) {

        return schoolService.findSchoolById(id);
    }

    @GetMapping("/getAll")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public List<School> findAllSchool() {

        return schoolService.getAllSchools();
    }

    @DeleteMapping("/delete/{id}")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public String deleteSchoolById(@PathVariable Long id) {

        return schoolService.deleteSchoolById(id);
    }
}
