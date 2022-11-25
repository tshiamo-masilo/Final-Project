package testing.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opsgenie.core.layer.Service;

import testing.demo.repositories.StudentApplicationRepo;
import testing.demo.entities.StudentApplication;

@Service
public class ApplicationService {
    @Autowired
    StudentApplicationRepo repository;

    public StudentApplication saveStudentApplication(StudentApplication student) {
        return repository.save(student);
    }

    public StudentApplication getStudentApplicationById(Long id) {
        return repository.findById(id).get();
    }

    public List<StudentApplication> getAllStudents() {
        return repository.findAll();
    }

    public String deleteStudentById(Long id) {
        repository.deleteById(id);
        return " Deleted";
    }

    public String deleteAll(Long id) {
        repository.deleteAll();
        return " Deleted";
    }

    public StudentApplication updateStudent(StudentApplication student) {

        StudentApplication existing = repository.findById(student.getId()).get();
        // updation pending
        return existing;
    }

}
