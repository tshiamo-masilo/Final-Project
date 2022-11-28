package testing.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testing.demo.entities.HighSchoolSubject;
import testing.demo.repositories.HighSchoolSubjectsRepository;

import java.util.List;

@Service
public class HighSchoolSubjectsService {
    @Autowired
    private HighSchoolSubjectsRepository repository;

    public HighSchoolSubject saveSubject(HighSchoolSubject subject){
        return  repository.save(subject);
    }

    public HighSchoolSubject getSubjectById(Long id ){
        return repository.findById(id).get();
    }

    public List<HighSchoolSubject> getAllSubjects(){
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

