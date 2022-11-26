package testing.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testing.demo.entities.HSubject;
import testing.demo.entities.JSubject;
import testing.demo.repositories.HighSchoolSubjectsRepository;
import testing.demo.repositories.JSubjectRepository;

import java.util.List;

@Service
public class HSubjectsService {
    @Autowired
    HighSchoolSubjectsRepository repository;


    public HSubject saveSubject(HSubject JSubject) {
        return repository.save(JSubject);
    }

    public HSubject getSubjectById(Long id) {
        return repository.findById(id).get();
    }

    public List<HSubject> getSubjects() {
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
