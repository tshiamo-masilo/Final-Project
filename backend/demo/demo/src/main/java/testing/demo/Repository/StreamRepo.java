package testing.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testing.demo.model.Stream;

import java.util.Optional;

public interface StreamRepo extends JpaRepository<Stream, Long> {
    Optional<Stream> findById(Long id);
}
