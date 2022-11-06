package testing.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testing.demo.model.StudentApplication;

public interface StudentApplicationRepo extends JpaRepository<StudentApplication, Long> {
}
