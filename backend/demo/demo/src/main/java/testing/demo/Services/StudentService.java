package testing.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import testing.demo.entities.Student;
import testing.demo.repositories.StudentRepo;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public Student saveStudent(Student student){
        return studentRepo.save(student);
    }
   public Student getStudentById(Long id){
        return studentRepo.findById(id).orElse(null);
   }
   public List<Student> getAllStudents(){
        return studentRepo.findAll();
   }
   public String deleteStudentById(Long id){
        studentRepo.deleteById(id);
        return "Record Deleted";
   }
    public String deleteAllStudent(){
        studentRepo.deleteAll();
        return "All Records are deleted";
    }

}
