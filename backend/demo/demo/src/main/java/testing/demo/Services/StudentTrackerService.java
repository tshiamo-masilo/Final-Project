package testing.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import testing.demo.entities.Student;
import testing.demo.entities.StudentTracker;
import testing.demo.repositories.SchoolRepo;
import testing.demo.repositories.StudentRepo;

@Service
public class StudentTrackerService {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private SchoolRepo schoolRepo;


    public StudentTracker findStudentsTracker(Long studentId) {
       Optional<Student> students = studentRepo.findById(studentId);

       //we have a problem, here 
       

        return null;
    }

    
}
