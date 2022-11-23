package testing.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import testing.demo.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
