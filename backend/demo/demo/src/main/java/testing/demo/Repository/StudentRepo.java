package testing.demo.Repository;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import testing.demo.model.Student;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student,Integer> {


}
