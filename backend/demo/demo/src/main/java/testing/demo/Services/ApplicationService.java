package testing.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import testing.demo.Repository.StudentApplicationRepo;
import testing.demo.model.StudentApplication;

public class ApplicationService {

    @Autowired
    private StudentApplicationRepo appRepo;


    //save indivisual application
    private StudentApplication addApplication(StudentApplication studentApplication){
        //check if application is updating or new
        //then set the status enum
        return appRepo.save(studentApplication);
        //gfjj
    }
}
