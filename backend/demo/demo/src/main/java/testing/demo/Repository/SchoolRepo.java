package testing.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testing.demo.model.School;
import testing.demo.model.StudentApplication;

public interface SchoolRepo extends JpaRepository<School, Long> {
}
