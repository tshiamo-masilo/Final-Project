package testing.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import testing.demo.entities.Requirements;

public interface RequirementsRepo extends JpaRepository<Requirements, Integer> {
    Requirements findById(int id);
}
