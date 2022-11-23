package testing.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testing.demo.Repository.StudentApplicationRepo;
import testing.demo.entities.StudentApplication;

import java.util.List;

@Service
public class ApplicationService {

    @Autowired
    private StudentApplicationRepo studentApplicationRepo;

    public StudentApplication saveStudentApplication(StudentApplication studentApplication) {
        // check if application is updating or new
        // then set the status enum
        return studentApplicationRepo.save(studentApplication);
    }

    public StudentApplication getStudentApplicationById(Long Id) {
        return studentApplicationRepo.findById(Id).get();
    }

    public String deleteStudentApplication() {
        studentApplicationRepo.deleteAll();
        return "the application is successfully deleted ";
    }

    public String deleteStudentApplicationById(Long Id) {
        studentApplicationRepo.deleteById(Id);
        return "Student application with :" + Id + " is deleted !";
    }

    public List<StudentApplication> getAllStudentApplication() {
        return studentApplicationRepo.findAll();
    }

    public StudentApplication updateStudentApplication(StudentApplication studentApplication) {
        StudentApplication existing = studentApplicationRepo.findById(studentApplication.getId()).get();
        existing.setId(studentApplication.getId());
        existing.setFullName(studentApplication.getFullName());
        existing.setIdentification(studentApplication.getIdentification());
        existing.setGender(studentApplication.getGender());
        existing.setDateOfBirth(studentApplication.getDateOfBirth());
        existing.setNationality(studentApplication.getNationality());
        existing.setHomeLanguage(studentApplication.getHomeLanguage());
        existing.setMobileNumber(studentApplication.getMobileNumber());
        existing.setGuardianFullName(studentApplication.getGuardianFullName());
        existing.setGuardianEmail(studentApplication.getGuardianEmail());
        existing.setGuardianPhoneNumber(studentApplication.getGuardianPhoneNumber());
        existing.setAddress(studentApplication.getAddress());
        existing.setCode(studentApplication.getCode());
        return existing;
    }

}
