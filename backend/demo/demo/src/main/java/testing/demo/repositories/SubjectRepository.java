package testing.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import testing.demo.entities.Subject;

import java.util.Optional;

public interface SubjectRepository extends JpaRepository<Subject,Long> {
    Optional<Subject> findById(Long id);
}
