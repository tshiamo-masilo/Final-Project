package testing.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import testing.demo.entities.JuniorSchoolSubject;

import java.util.Optional;

public interface JuniorSubjectsRepository extends JpaRepository<JuniorSchoolSubject,Long> {
    Optional<JuniorSchoolSubject> findById(Long id);
}
