package testing.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testing.demo.model.Guardian;

public interface GuardianRepo extends JpaRepository<Guardian, Integer> {
}
