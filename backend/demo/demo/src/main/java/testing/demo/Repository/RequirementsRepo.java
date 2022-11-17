package testing.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testing.demo.model.Requirements;

public interface RequirementsRepo extends JpaRepository<Requirements,Long> {
    Requirements findById(int id);
}
