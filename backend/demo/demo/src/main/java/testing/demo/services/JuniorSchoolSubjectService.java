package testing.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testing.demo.entities.JSubject;
import testing.demo.repositories.JSubjectRepository;

import java.util.List;

@Service
public class JSubjectService {
    @Autowired
    JSubjectRepository repository;

    public JSubject saveSubject(JSubject JSubject) {
        return repository.save(JSubject);
    }

    public JSubject getSubjectById(Long id) {
        return repository.findById(id).get();
    }

    public List<JSubject> getSubjects() {
        return repository.findAll();
    }

    public String deleteSubjectById(Long id) {
        repository.deleteById(id);
        return "Subject with " + id + " Id is successfully deleted!";
    }

    public String deleteAllSubjects() {
        repository.deleteAll();
        return "Successfully Deleted!";
    }


}
