package testing.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testing.demo.Repository.StreamsRepo;
import testing.demo.model.Streams;

import java.util.List;
import java.util.Optional;

@Service
public class StreamService {
    @Autowired
    private   StreamsRepo streamsRepo;

    public Streams saveStream( Streams stream){
       return streamsRepo.save(stream);
    }

    public List<Streams> getAllStreams(){
        return streamsRepo.findAll();
    }
    public Streams getStreamById(int id){
        return streamsRepo.findById(id);
    }
    public String deleteStreamById(int id){
        streamsRepo.deleteById(id);
        return "Stream with Id:"+id+" is deleted";
    }
    public String deleteAllStreams(){
        streamsRepo.deleteAll();
        return "All Streams are deleted";
    }

}
