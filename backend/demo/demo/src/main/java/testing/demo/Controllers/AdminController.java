package testing.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testing.demo.Services.AdminService;
import testing.demo.Services.StudentService;
import testing.demo.model.Admin;
import testing.demo.model.Student;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private StudentService studentService;
    /*
    Documentation of admin dashboard
    1. Admin to set number of spaces at school
    2. Admin to be able to accept learnrs
    3. Admin to be able delete and add learners to db



@PostMapping
    public ResponseEntity<Void> createPost(@RequestBody PostRequest postRequest) {
        postService.save(postRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<PostResponse>> getAllPosts() {
        return status(HttpStatus.OK).body(postService.getAllPosts());
    }
     */

    //get all learners who applied
    @GetMapping("/getAppliedLearners")
    public List<Student> getLearnerAllByAppliedStatus(){
        //create student applied fetch req
        return studentService.getAllStudents();
    }

    @GetMapping("/getAllStudent")
    public List<Student> getAllSchoolLearners(){
        return studentService.getAllStudents();
    }

    @PostMapping("/saveAdmin")
    public Admin saveAdmin(@RequestBody Admin admin){
        return adminService.savePerson(admin) ;
    }

    @GetMapping("/getAdmin/{id}")
    public Admin findAdminById(@PathVariable Long id){

        return adminService.findPersonById(id);
    }
    //Test function
    /*
    @GetMapping("/Testing")
    public String Testing(){
        return "API Working";
    }
*/
    @GetMapping("/getAllAdmin")
    public List<Admin> findAllAdmin(){
        return adminService.getAllUser();
    }


    @DeleteMapping("/deleteAdmin/{id}")
    public String deleteAdminById(@PathVariable Long id){
        return adminService.deleteById(id);
    }
}

