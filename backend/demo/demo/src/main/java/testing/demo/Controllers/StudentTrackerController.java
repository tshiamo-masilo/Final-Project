package testing.demo.controllers;

import org.springframework.web.bind.annotation.*;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import testing.demo.entities.ApiResponse;
import testing.demo.entities.Student;
import testing.demo.entities.User;
import testing.demo.services.SchoolService;
import testing.demo.services.StudentService;
import testing.demo.services.UserService;

@RestController
@RequestMapping("/StudentTracker")
public class StudentTrackerController {

    @Autowired
    private UserService userService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private SchoolService schoolService;

    /**
     * @return ApiResponse
     */
    @GetMapping("/get/{id}")
    public ApiResponse<String> getStudentTracker(@PathVariable Long id) {

        if (id == null) {
            return new ApiResponse<String>(HttpStatus.BAD_REQUEST, "Id cannot be null", null);
        }
        Student student = studentService.getStudentById(id);

        //When student with id is not found
        if (student == null) {
            return new ApiResponse<String>(HttpStatus.NOT_FOUND, "Student with id "+ id+ " could not be found", null);
        }
        // String school = student.getSchool_id();
        System.out.println("I am school id " + student);


        // Check role before responding to request
        return new ApiResponse<String>(HttpStatus.OK, "Hello user", null);
    }

}
