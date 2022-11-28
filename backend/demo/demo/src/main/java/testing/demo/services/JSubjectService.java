package testing.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testing.demo.entities.JuniorSchoolSubject;
import testing.demo.repositories.JuniorSubjectsRepository;

import java.util.List;

@Service
public class JSubjectService {
    @Autowired
    JuniorSubjectsRepository repository;

    public JuniorSchoolSubject saveSubject(JuniorSchoolSubject Subject) {
        return repository.save(Subject);
    }

    public JuniorSchoolSubject getSubjectById(Long id) {
        return repository.findById(id).get();
    }

    public List<JuniorSchoolSubject> getSubjects() {
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
