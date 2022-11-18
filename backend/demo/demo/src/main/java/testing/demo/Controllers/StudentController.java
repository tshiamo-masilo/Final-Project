package testing.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

<<<<<<< HEAD
import testing.demo.model.Student;
import testing.demo.Services.StudentService;
=======
import testing.demo.entities.Student;
import testing.demo.services.StudentService;
>>>>>>> db9abb4a47de7be7c0cc363c5cf5ab39f622ccc7

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/saveStudent")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public Student addStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/get/{id}")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/getAllStudents")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @DeleteMapping("/delete/{id}")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public String deleteStudentById(@PathVariable Long id) {
        return studentService.deleteStudentById(id);
    }

    @DeleteMapping("/deleteAllStudents")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public String deleteAllStudents() {
        return studentService.deleteAllStudent();
    }
}
