package testing.demo.Repository;

import org.hibernate.boot.JaccPermissionDefinition;
import org.springframework.data.jpa.repository.JpaRepository;
import testing.demo.model.Streams;

public interface StreamsRepo extends JpaRepository<Streams, Integer> {
    Streams findById(int id);
}
