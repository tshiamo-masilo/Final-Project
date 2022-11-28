package testing.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import testing.demo.entities.StudentApplication;

import java.util.Optional;

public interface StudentApplicationRepo extends JpaRepository<StudentApplication, Long> {
        Optional<StudentApplication> findById(Long id);
}
