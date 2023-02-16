package testing.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testing.demo.entities.Subjects;
import testing.demo.repositories.SubjectsRepository;

import java.util.List;

@Service
public class SubjectsService {
    @Autowired
    private SubjectsRepository repository;

    public Subjects saveSubject(Subjects subject){
        return  repository.save(subject);
    }

    public Subjects getSubjectById(Long id ){
        return repository.findById(id).get();
    }

    public List<Subjects> getAllSubjects(){
        return repository.findAll();
    }

    public String deleteSubjectById(Long id){
         repository.deleteById(id);
         return "Subject with id "+id+" is deleted";
    }
    public String deleteAllSubjects(){
        repository.deleteAll();
        return "All subjects deleted!";
    }
}

