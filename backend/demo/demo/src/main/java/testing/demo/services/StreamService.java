package testing.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testing.demo.Repository.StreamRepo;
import testing.demo.model.Stream;

import java.util.List;

@Service
public class StreamService {
    @Autowired
    private StreamRepo streamsRepo;

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

    public Stream updateStream(Stream stream) {
        Stream existing = streamsRepo.findById(stream.getId()).get();
        existing.setStreamName(stream.getStreamName());
        existing.setSubject(stream.getSubject());
        existing.setSchool(stream.getSchool());
        return existing;
    }
}
