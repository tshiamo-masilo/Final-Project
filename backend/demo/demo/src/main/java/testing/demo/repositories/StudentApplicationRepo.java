package testing.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import testing.demo.entities.StudentApplication;

public interface StudentApplicationRepo extends JpaRepository<StudentApplication, Long> {
}
