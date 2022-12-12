package testing.demo.services;


import org.springframework.stereotype.Service;

import testing.demo.entities.Stream;
import testing.demo.repositories.StreamRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StreamService {
    private StreamRepository streamsRepository;

    public Stream saveStream(Stream stream) {
        return streamsRepository.save(stream);
    }

    public List<Stream> getAllStreams() {

        return streamsRepository.findAll();
    }

    public Optional<Stream> getStreamById(Long id) {
        return streamsRepository.findById(id);
    }

    public String deleteStreamById( Long id) {
        streamsRepository.deleteById(id);
        return "Stream with Id:" + id + " is deleted";
    }

    public String deleteAllStream() {
        streamsRepository.deleteAll();
        return "All Stream are deleted";
    }

   
}
