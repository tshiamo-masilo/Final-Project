package testing.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import testing.demo.model.School;
import testing.demo.Services.SchoolService;

import java.util.List;

@RestController
@RequestMapping("/school")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @PostMapping("/save")
<<<<<<< HEAD
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
=======
    @CrossOrigin
>>>>>>> 69a29dee79dfbb0972d442b12270179118efa477
    public School saveSchool(@RequestBody School school) {

        return schoolService.saveSchool(school);
    }

    @GetMapping("/get/{id}")
<<<<<<< HEAD
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
=======
    @CrossOrigin
>>>>>>> 69a29dee79dfbb0972d442b12270179118efa477
    public School findSchoolById(@PathVariable Long id) {

        return schoolService.findSchoolById(id);
    }

    @GetMapping("/getAll")
<<<<<<< HEAD
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
=======
>>>>>>> 69a29dee79dfbb0972d442b12270179118efa477
    public List<School> findAllSchool() {

        return schoolService.getAllSchools();
    }

    @DeleteMapping("/delete/{id}")
<<<<<<< HEAD
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
=======
>>>>>>> 69a29dee79dfbb0972d442b12270179118efa477
    public String deleteSchoolById(@PathVariable Long id) {

        return schoolService.deleteSchoolById(id);
    }
}
