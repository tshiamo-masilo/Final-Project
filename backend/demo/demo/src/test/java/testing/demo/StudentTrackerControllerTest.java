package testing.demo;

import static org.junit.jupiter.api.Assertions.fail;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import testing.demo.controllers.StudentApplicationController;
import testing.demo.controllers.StudentTrackerController;

public class StudentTrackerControllerTest {

      StudentTrackerController studentTrackerController;

    @BeforeEach
    public void initializeStudentTracker(){
        studentTrackerController = new StudentTrackerController();
     
    }

    @Test
    public void throwErrorWhenIdIsNull(){
        studentTrackerController.getStudentTracker(null);
        fail("Should fail");
    }
    
}
