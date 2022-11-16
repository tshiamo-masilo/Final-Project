package testing.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import testing.demo.entities.Status;
import testing.demo.entities.StudentApplication;

import java.util.List;

public interface StudentApplicationRepo extends JpaRepository<StudentApplication, Long> {

    List<StudentApplication> findByStatus(Status status);
}
