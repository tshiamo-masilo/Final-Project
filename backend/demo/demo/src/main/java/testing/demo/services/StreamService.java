package testing.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testing.demo.entities.Stream;
import testing.demo.repositories.StreamRepository;

import java.util.List;

@Service
public class StreamService {
    @Autowired
    private StreamRepository repository;

    public Stream saveStream(Stream stream) {
        return repository.save(stream);
    }

    public Stream getStreamById(Long id) {
        return repository.findById(id).get();
    }

    public List<Stream> getAllStreams() {
        return repository.findAll();
    }

    public String deleteStreamById(Long id) {
        repository.deleteById(id);
        return "A Stream with  Id  " + id + " is deleted!!";
    }
    public String deleteAllStreams() {
        repository.deleteAll();
        return "All Stream are deleted!!";
    }
}
