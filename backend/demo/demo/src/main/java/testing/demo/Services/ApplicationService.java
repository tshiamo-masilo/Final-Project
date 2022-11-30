package testing.demo.services;


import org.springframework.beans.factory.annotation.Autowired;

import com.opsgenie.core.layer.Service;

import org.springframework.stereotype.Component;
import testing.demo.repositories.StudentApplicationRepo;
import testing.demo.entities.StudentApplication;

import java.util.List;

@Service
@Component
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
        existing.setFullName(student.getFullName());
        existing.setIdentification(student.getIdentification());
        existing.setGender(student.getGender());
        existing.setDateOfBirth(student.getDateOfBirth());
        existing.setNationality(student.getNationality());
        existing.setHomeLanguage(student.getHomeLanguage());
        existing.setMobileNumber(student.getMobileNumber());
        existing.setGuardianFullName(student.getGuardianFullName());
        existing.setGuardianEmail(student.getGuardianEmail());
        existing.setGuardianPhoneNumber(student.getGuardianPhoneNumber());
        existing.setAddress(student.getAddress());
        existing.setCode(student.getCode());

        return existing;

    }

}
