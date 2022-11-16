package testing.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import testing.demo.entities.Student;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student, Long> {


}
