package testing.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< HEAD:backend/demo/demo/src/main/java/testing/demo/Repository/RequirementsRepo.java
public interface RequirementsRepo extends JpaRepository<Requirements,Long> {
=======
import testing.demo.entities.Requirements;

public interface RequirementsRepo extends JpaRepository<Requirements, Integer> {
>>>>>>> db9abb4a47de7be7c0cc363c5cf5ab39f622ccc7:backend/demo/demo/src/main/java/testing/demo/repositories/RequirementsRepo.java
    Requirements findById(int id);
}
