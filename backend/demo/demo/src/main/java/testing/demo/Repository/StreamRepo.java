package testing.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testing.demo.model.Stream;

public interface StreamRepo extends JpaRepository<Stream,Integer> {
    Stream findById(int id);
}
