package testing.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import testing.demo.entities.Stream;

public interface StreamRepo extends JpaRepository<Stream, Integer> {
    Stream findById(int id);
}
