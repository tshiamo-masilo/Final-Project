package testing.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import testing.demo.entities.Guardian;


public interface GuardianRepo extends JpaRepository<Guardian, Integer> {
}
