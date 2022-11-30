package testing.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import testing.demo.entities.School;

import java.util.Optional;

public interface SchoolRepo extends JpaRepository<School, Long> {
        Optional<School> findById(Long id);
}
