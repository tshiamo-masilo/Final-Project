package testing.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import testing.demo.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {
    Optional<Student>findById(Student student);

}
