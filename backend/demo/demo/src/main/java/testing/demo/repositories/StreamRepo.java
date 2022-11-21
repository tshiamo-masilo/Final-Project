package testing.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import testing.demo.entities.Stream;

import java.util.Optional;

public interface StreamRepo extends JpaRepository<Stream, Long> {
    Optional<Stream> findById(Long id);
}
