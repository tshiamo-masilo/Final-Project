package testing.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import testing.demo.entities.Admin;

import java.util.Optional;

public interface AdminRepo extends JpaRepository<Admin, Long> {
    Optional<Admin> findById(Long id);
}
