package testing.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import testing.demo.entities.Student;
import testing.demo.services.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/saveStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/get/{id}")
    public Student getStudentById(Long id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudentById(Long id) {
        return studentService.deleteStudentById(id);
    }

    @DeleteMapping("/deleteAllStudents")
    public String deleteAllStudents() {
        return studentService.deleteAllStudent();
    }
}
