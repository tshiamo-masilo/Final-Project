package testing.demo.services;


import org.springframework.stereotype.Service;

import testing.demo.entities.Stream;
import testing.demo.repositories.StreamRepository;

import java.util.List;

@Service
public class StreamService {
    private StreamRepository streamsRepository;

    public Stream saveStream(Stream stream) {
        return streamsRepository.save(stream);
    }
    public List<Stream> getAllStreams() {

        return streamsRepository.findAll();
    }
    public Stream getStreamById(Long id) {
        return streamsRepository.findById(id).get();
    }
    public String deleteStreamById(Long id) {
        streamsRepository.deleteById(id);
        return "Stream with Id:" + id + " is deleted";
    }
    public String deleteAllStream() {
        streamsRepository.deleteAll();
        return "All Stream are deleted";
    }
    public Stream updateStream(Stream stream) {
        return stream;
    }
}
