package testing.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testing.demo.Services.ApplicationService;
import testing.demo.dtos.StudentApplicationDto;
import testing.demo.entities.Status;

import java.util.List;
import java.util.Optional;

@RestController("/application")
public class StudentApplicationController {

   // @Autowired
   // Student
    @Autowired
    ApplicationService appService;

    @GetMapping("/all")
    public List<StudentApplicationDto> getAllApplications(){
        return appService.getAllApplicatios();
    }

    @GetMapping("/id?={id}")
    public StudentApplicationDto getApplicationById(@PathVariable Long id){
        return appService.getApplicationById(id);
    }

    @PostMapping("/post/id?={id}")
    public StudentApplicationDto acceptLearner(@PathVariable Long id,@RequestBody StudentApplicationDto dto){
        dto.setStatus(Status.Accepted);
        return appService.saveStudentApplication(dto);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteLearners(@PathVariable Long id){

        return appService.deleteById(id);

    }
}

/*
getMapping
 return new ApiResponse<User>(HttpStatus.OK, principal.toString(), userService.getUserByEmail(email));

getAllApplications(): Observable<any>  {
      return this.http.get(`${this.apiUrl}/applications/all`);
    }

    getApplicationById(id: any): Observable<any>  {
      return this.http.get(`${this.apiUrl}/application/id?=${id}`);
    }

    acceptLearnerById(id:any , body: any): Observable<any>  {
      return this.http.post(`${this.apiUrl}/application/post/id?=${id}`, body);
    }


    deleteApplicationById(id: any, ):Observable<any> {
      return this.http.delete(`${this.apiUrl}/application/delete/id?=${id}`);
    }

    deleteAllApllications():Observable<any>{
      return this.http.delete(`${this.apiUrl}/application/deleteAll`)
    }
 */