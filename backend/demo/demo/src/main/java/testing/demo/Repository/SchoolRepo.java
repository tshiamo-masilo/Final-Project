package testing.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testing.demo.model.School;

public interface SchoolRepo extends JpaRepository<School, Long> {
}
