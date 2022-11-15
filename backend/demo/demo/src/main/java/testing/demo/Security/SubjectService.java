package testing.demo.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testing.demo.Repository.SubjectRepository;
import testing.demo.model.Subject;

import java.util.List;


@Service
public class SubjectService {
    @Autowired
    SubjectRepository repository;

    public Subject saveSubject(Subject subject){
        return repository.save(subject);
    }
    public Subject getSubjectById(Long id){
        return repository.findById(id).get();
    }
    public List<Subject> getSubjects(){
        return repository.findAll();
    }
    public  String deleteSubjectById(Long id){
        repository.deleteById(id);
        return "Subject with "+id+" Id is successfully deleted!";
    }
    public  String deleteAllSubjects(){
        repository.deleteAll();
        return "Successfully Deleted!";
    }
    public Subject updateSubject(Subject subject){
        Subject existing = repository.findById(subject.getId()).get();
        existing.setName(subject.getName());
        existing.setDescription(subject.getDescription());
        return existing;
    }


}
