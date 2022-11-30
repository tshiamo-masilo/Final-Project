package testing.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import testing.demo.entities.Subjects;

import java.util.Optional;

public interface SubjectsRepository extends JpaRepository<Subjects,Long> {
        Optional<Subjects> findById(Long id);
}
