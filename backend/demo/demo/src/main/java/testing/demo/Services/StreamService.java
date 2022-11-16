package testing.demo.services;


import org.springframework.stereotype.Service;

import testing.demo.entities.Stream;
import testing.demo.repositories.StreamRepo;

import java.util.List;

@Service
public class StreamService {
    private StreamRepo streamsRepo;

    public Stream saveStream(Stream stream) {
        return streamsRepo.save(stream);
    }

    public List<Stream> getAllStreams() {

        return streamsRepo.findAll();
    }
<<<<<<< HEAD

=======
    // public List<Stream> getStream(String id){
    // return streamsRepo.
    // }
>>>>>>> 16cd37d4f76e412aec94c726ea618a1905a32b1d

    public Stream getStreamById(int id) {
        return streamsRepo.findById(id);
    }

    public String deleteStreamById(int id) {
        streamsRepo.deleteById(id);
        return "Stream with Id:" + id + " is deleted";
    }

    public String deleteAllStream() {
        streamsRepo.deleteAll();
        return "All Stream are deleted";
    }

    public Stream updateStream(Stream stream) {
        Stream existing = streamsRepo.findById(stream.getId());
        existing.setStreamName(stream.getStreamName());
        existing.setStreamId(stream.getStreamId());
        existing.setSchoolId(stream.getSchoolId());
        existing.setSubject1(stream.getSubject1());
        existing.setSubject2(stream.getSubject2());
        existing.setSubject3(stream.getSubject3());
        existing.setSubject4(stream.getSubject4());
        return existing;
    }
}
