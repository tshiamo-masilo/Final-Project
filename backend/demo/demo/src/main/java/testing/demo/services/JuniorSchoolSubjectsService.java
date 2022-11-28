package testing.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testing.demo.entities.JuniorSchoolSubject;
import testing.demo.repositories.JuniorSubjectsRepository;

import java.util.List;

@Service
public class JuniorSchoolSubjectsService {
    @Autowired
    private JuniorSubjectsRepository repository;

    public JuniorSchoolSubject saveSubject(JuniorSchoolSubject subject){
        return  repository.save(subject);
    }

    public JuniorSchoolSubject getSubjectById(Long id ){
        return repository.findById(id).get();
    }

    public List<JuniorSchoolSubject> getAllSubjects(){
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
