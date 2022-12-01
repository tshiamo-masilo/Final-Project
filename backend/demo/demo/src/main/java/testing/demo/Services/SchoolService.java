package testing.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testing.demo.repositories.SchoolRepo;
import testing.demo.entities.School;

import java.util.List;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepo repo;

    public School saveSchool(School school) {
        return repo.save(school);
    }

    public School findSchoolById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public List<School> getAllSchools() {
        return repo.findAll();
    }

    public String deleteSchoolById(Long id) {
        repo.deleteById(id);
        return "A School with  Id  " + id + " is deleted!!";
    }
}
