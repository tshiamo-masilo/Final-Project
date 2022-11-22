package testing.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import testing.demo.entities.School;

public interface SchoolRepo extends JpaRepository<School, Long> {
}
