package testing.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testing.demo.Repository.SchoolRepo;
import testing.demo.model.School;

import java.util.List;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepo repo;

    public School saveSchool(School school){
        return repo.save(school)  ;
    }

    public School findSchoolById(int id){
        return repo.findById(id).orElse(null);
    }
    public List<School> getAllSchools(){
        return  repo.findAll();
    }

    public String deleteSchoolById(int id){
        repo.deleteById(id);
        return "A School with  Id  " +id +" is deleted!!";
    }
}
