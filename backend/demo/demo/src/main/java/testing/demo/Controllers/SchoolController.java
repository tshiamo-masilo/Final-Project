package testing.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import testing.demo.entities.School;
import testing.demo.services.SchoolService;

@RestController
@RequestMapping("/School")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @PostMapping("/saveSchool")
    public School saveSchool(@RequestBody School school) {

        return schoolService.saveSchool(school);
    }

    @GetMapping("/getSchool/{id}")
    public School findSchoolById(@PathVariable Long id) {

        return schoolService.findSchoolById(id);
    }

    @GetMapping("/getAllSchool")
    public List<School> findAllSchool() {

        return schoolService.getAllSchools();
    }

    @DeleteMapping("/deleteSchool/{id}")
    public String deleteSchoolById(@PathVariable Long id) {

        return schoolService.deleteSchoolById(id);
    }
}
