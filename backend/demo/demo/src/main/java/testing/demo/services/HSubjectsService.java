package testing.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import testing.demo.entities.HighSchoolSubject;
import testing.demo.repositories.HighSchoolSubjectsRepository;
import java.util.List;

@Service
public class HSubjectsService {
    @Autowired
    HighSchoolSubjectsRepository repository;


    public HighSchoolSubject saveSubject(HighSchoolSubject Subject) {
        return repository.save(Subject);
    }

    public HighSchoolSubject getSubjectById(Long id) {
        return repository.findById(id).get();
    }

    public List<HighSchoolSubject> getSubjects() {
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
