package testing.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testing.demo.model.UserCredentials;

public interface UserCredentialRepo extends JpaRepository<UserCredentials, Integer> {


}
