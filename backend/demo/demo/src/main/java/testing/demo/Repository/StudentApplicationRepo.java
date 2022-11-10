package testing.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testing.demo.model.Status;
import testing.demo.model.StudentApplication;

import java.util.List;

public interface StudentApplicationRepo extends JpaRepository<StudentApplication, Long> {

    List<StudentApplication> findByStatus(Status status);
}
