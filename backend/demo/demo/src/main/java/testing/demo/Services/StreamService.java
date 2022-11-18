package testing.demo.services;


<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
=======
>>>>>>> db9abb4a47de7be7c0cc363c5cf5ab39f622ccc7
import org.springframework.stereotype.Service;

import testing.demo.entities.Stream;
import testing.demo.repositories.StreamRepo;

import java.util.List;

@Service
public class StreamService {
<<<<<<< HEAD
    @Autowired
=======
>>>>>>> db9abb4a47de7be7c0cc363c5cf5ab39f622ccc7
    private StreamRepo streamsRepo;

    public Stream saveStream(Stream stream) {
        return streamsRepo.save(stream);
    }

    public List<Stream> getAllStreams() {
<<<<<<< HEAD
        return streamsRepo.findAll();
    }
    public Stream getStreamById(Long id) {
        return streamsRepo.findById(id).get();
    }

    public String deleteStreamById(Long id) {
=======

        return streamsRepo.findAll();
    }

    public Stream getStreamById(int id) {
        return streamsRepo.findById(id);
    }

    public String deleteStreamById(int id) {
>>>>>>> db9abb4a47de7be7c0cc363c5cf5ab39f622ccc7
        streamsRepo.deleteById(id);
        return "Stream with Id:" + id + " is deleted";
    }

    public String deleteAllStream() {
        streamsRepo.deleteAll();
        return "All Stream are deleted";
    }

    public Stream updateStream(Stream stream) {
<<<<<<< HEAD
        Stream existing = streamsRepo.findById(stream.getId()).get();
=======
        Stream existing = streamsRepo.findById(stream.getId());
>>>>>>> db9abb4a47de7be7c0cc363c5cf5ab39f622ccc7
        existing.setStreamName(stream.getStreamName());
        existing.setSubject(stream.getSubject());
        existing.setSchool(stream.getSchool());
        return existing;
    }
}
