package testing.demo.mapper;

import org.modelmapper.ModelMapper;
import testing.demo.dto.SchoolDto;
import testing.demo.dto.StudentApplicationDto;
import testing.demo.dto.SchoolDto;
import testing.demo.dto.StudentDto;
import testing.demo.model.School;
import testing.demo.model.Student;
import testing.demo.model.StudentApplication;

import java.util.List;
import java.util.stream.Collectors;

public class SchoolMapper {

    public List<SchoolDto> entityToDto(List<School> dto) {

        return	dto.stream().map(x -> entityToDto(x)).collect(Collectors.toList());

    }
    public School dtoToEntity(SchoolDto dto)
    {
//      st.setId(dto.getId());
//		st.setName(dto.getName());
//		st.setPassword(dto.getPassword());
//		st.setUsername(dto.getUsername());
        ModelMapper mapper = new ModelMapper();
        School map = mapper.map(dto, School.class);
        return map;
    }
    public List<School> dtoToEntity(List<SchoolDto> dto)
    {
        return dto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
    }

    public SchoolDto entityToDto(School sl) {
        //convert entity to dto (data transfer object )
        //method 1
        //StudentApplicationDto dto = new StudentApplicationDto();
        //dto.setApplicationId(studentApplication.getApplicationId());
        //dto.setStatus(studentApplication.getStatus());
        //return dto;
        //method 2
        ModelMapper mapper = new ModelMapper();
        SchoolDto map = mapper.map(sl, SchoolDto.class);
        return map;
    }
}
