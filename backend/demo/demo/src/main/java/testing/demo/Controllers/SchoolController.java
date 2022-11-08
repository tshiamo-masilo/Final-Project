package testing.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testing.demo.Services.SchoolService;
import testing.demo.dto.SchoolDto;
import testing.demo.model.School;

import java.util.List;

@RestController
@RequestMapping("/School")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;


    @PostMapping("/saveSchool")
    public SchoolDto saveSchool(@RequestBody SchoolDto school){

        return schoolService.saveSchool(school) ;
    }

    @GetMapping("/getSchool/{id}")
    public SchoolDto findSchoolById(@PathVariable Long id){

        return schoolService.findSchoolById(id);
    }

    @GetMapping("/getAllSchool")
    public List<SchoolDto> findAllSchool(){

        return schoolService.getAllSchools();
    }


    @DeleteMapping("/deleteSchool/{id}")
    public String deleteSchoolById(@PathVariable Long id){

        return schoolService.deleteSchoolById(id);
    }
}
