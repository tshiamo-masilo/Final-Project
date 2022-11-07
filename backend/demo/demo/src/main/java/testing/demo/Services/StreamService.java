package testing.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testing.demo.Repository.StreamRepo;
import testing.demo.model.Stream;

import java.util.List;

@Service
public class StreamService {
    @Autowired
    private StreamRepo streamsRepo;

    public Stream saveStream(Stream stream){
        return streamsRepo.save(stream);
    }

    public List<Stream> getAllStreams(){
        return streamsRepo.findAll();
    }
    public Stream getStreamById(int id){
        return streamsRepo.findById(id);
    }
    public String deleteStreamById(int id){
        streamsRepo.deleteById(id);
        return "Stream with Id:"+id+" is deleted";
    }
    public String deleteAllStream(){
        streamsRepo.deleteAll();
        return "All Stream are deleted";
    }
    public Stream updateStream(Stream stream){
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
