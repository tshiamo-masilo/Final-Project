package testing.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import testing.demo.entities.HighSchoolSubject;

import java.util.Optional;

public interface HighSchoolSubjectsRepository extends JpaRepository<HighSchoolSubject,Long> {
        Optional<HighSchoolSubject> findById(Long id);
}
