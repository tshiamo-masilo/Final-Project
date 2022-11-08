package testing.demo.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testing.demo.Repository.StudentApplicationRepo;
import testing.demo.Services.ApplicationService;
import testing.demo.dto.StudentApplicationDto;
import testing.demo.mapper.StudentApplicationMapper;
import testing.demo.model.StudentApplication;

@RestController("/application")
public class StudentApplicationController {


    @Autowired
    private ApplicationService applicationService;

    @GetMapping("/find/{id}")
    public StudentApplicationDto findById(@PathVariable Long id) {
        return applicationService.getApplicationById(id);
    }

    @PostMapping("/save")
    public StudentApplicationDto save(@RequestBody StudentApplicationDto dto) {
            return applicationService.saveStudentApplication(dto);
    }
   @PostMapping("/Apply/{id}/save")
    public StudentApplicationDto saveApplication( @PathVariable Long id, @RequestBody StudentApplicationDto dto){
        return applicationService.saveById(id,dto);
   }
   // Student
}
