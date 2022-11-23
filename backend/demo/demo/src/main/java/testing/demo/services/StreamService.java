package testing.demo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import testing.demo.entities.Stream;
import testing.demo.repositories.StreamRepo;

import java.util.List;

@Service
public class StreamService {

    @Autowired
    private StreamRepo streamsRepo;

    public StreamService(StreamRepo streamsRepo) {
        this.streamsRepo = streamsRepo;
    }

    public Stream saveStream(Stream stream) {
        return streamsRepo.save(stream);
    }

    public List<Stream> getAllStreams() {
        return streamsRepo.findAll();
    }
    public Stream getStreamById(Long id) {
        return streamsRepo.findById(id).get();
    }

    public String deleteStreamById(Long id) {
        streamsRepo.deleteById(id);
        return "Stream with Id:" + id + " is deleted";
    }
    public String deleteAllStream() {
        streamsRepo.deleteAll();
        return "All Stream are deleted";
    }

}
