package testing.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import testing.demo.entities.StudentApplication;

public interface StudentApplicationRepo extends JpaRepository<StudentApplication, Long> {
    Optional<StudentApplication> findById(Long id);
}
