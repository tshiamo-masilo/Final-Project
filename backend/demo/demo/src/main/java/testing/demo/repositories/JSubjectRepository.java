package testing.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import testing.demo.entities.JSubject;

import java.util.Optional;

public interface JSubjectRepository extends JpaRepository<JSubject,Long> {
    Optional<JSubject> findById(Long id);
}
