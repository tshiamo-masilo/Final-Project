package testing.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import testing.demo.entities.HSubject;

import java.util.Optional;

public interface HighSchoolSubjectsRepository extends JpaRepository<HSubject,Long> {

    Optional<HSubject> findById(Long aLong);
}
