package testing.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testing.demo.entities.StudentApplication;
import testing.demo.repositories.StudentApplicationRepo;

@Service
public class ApplicationService {

    @Autowired
    private StudentApplicationRepo appRepo;

    // save individual application
    private StudentApplication addApplication(StudentApplication studentApplication) {
        // check if application is updating or new
        // then set the status enum
        return appRepo.save(studentApplication);

    }
}
