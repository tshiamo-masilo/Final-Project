package testing.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testing.demo.Repository.StudentApplicationRepo;
import testing.demo.dto.StudentApplicationDto;
import testing.demo.mapper.StudentApplicationMapper;
import testing.demo.model.StudentApplication;

import java.util.List;

@Service
public class ApplicationService {

    @Autowired
    private StudentApplicationRepo appRepo;
    @Autowired
    private StudentApplication studentApplication;
    private List<StudentApplication> studentApplicationList;
    @Autowired
    private StudentApplicationMapper Objmapper;

    public StudentApplicationDto saveStudentApplication(StudentApplicationDto dto){
            studentApplication = Objmapper.dtoToEntity(dto);
            appRepo.save(studentApplication);
            return Objmapper.entityToDto(studentApplication);
    }

    public StudentApplicationDto getApplicationById(Long id){
        //dto.setApplicationId(id);
        studentApplication = appRepo.getReferenceById(id);
        return Objmapper.entityToDto(studentApplication);
    }
    public List<StudentApplicationDto> saveAllStudentApplication(List<StudentApplicationDto> dto){
        studentApplicationList = Objmapper.dtoToEntity(dto);
        appRepo.saveAll(studentApplicationList);
        return Objmapper.entityToDto(studentApplicationList);
    }

    public StudentApplicationDto saveById(Long id,StudentApplicationDto dto){
        dto.setApplicationId(id);
        studentApplication = Objmapper.dtoToEntity(dto);
        appRepo.save(studentApplication);
        return Objmapper.entityToDto(studentApplication);
    }
}


