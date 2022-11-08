package testing.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testing.demo.Repository.SchoolRepo;
import testing.demo.dto.SchoolDto;
import testing.demo.model.School;
import testing.demo.mapper.SchoolMapper;
import java.util.List;


@Service
public class SchoolService {
    @Autowired
    private SchoolRepo repo;
    private SchoolMapper objMapper;

    public SchoolDto saveSchool(SchoolDto schoolDto){
        School school = objMapper.dtoToEntity(schoolDto);
        repo.save(school);
        return objMapper.entityToDto(school);
    }

    public SchoolDto findSchoolById(Long id){
        SchoolDto schoolDto;
        School school;
        school = repo.getReferenceById(id);
        return objMapper.entityToDto(school);
      //  return repo.findById(id).orElse(null);
    }
    public List<SchoolDto> getAllSchools()
    {
        return  objMapper.entityToDto(repo.findAll());

    }

    public String deleteSchoolById(Long id){
        repo.deleteById(id);
        return "A School with  Id  " +id +" is deleted!!";
    }
}
