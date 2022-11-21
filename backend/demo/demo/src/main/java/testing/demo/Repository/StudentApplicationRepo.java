package testing.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testing.demo.model.StudentApplication;

import java.util.Optional;

public interface StudentApplicationRepo extends JpaRepository<StudentApplication, Long> {
    @Override
    Optional<StudentApplication> findById(Long aLong);
}
