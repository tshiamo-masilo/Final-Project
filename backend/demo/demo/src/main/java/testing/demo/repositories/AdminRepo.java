package testing.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import testing.demo.entities.Admin;
import testing.demo.entities.Stream;

import java.util.Optional;

public interface AdminRepo extends JpaRepository<Admin, Long> {
    Optional<Object> findById(Admin admin);

    interface StreamRepo extends JpaRepository<Stream, Long> {
        Optional<Stream> findById(Long id);
    }
}
