package testing.demo.mapper;

import org.modelmapper.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import testing.demo.dto.StudentApplicationDto;
import testing.demo.dto.StudentDto;
import testing.demo.model.Student;
import testing.demo.model.StudentApplication;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentApplicationMapper {

	public  List<StudentApplicationDto> entityToDto(List<StudentApplication> student) {

		return	student.stream().map(x -> entityToDto(x)).collect(Collectors.toList());

	}


    public StudentApplication dtoToEntity(StudentApplicationDto dto)
    {
        //st.setId(dto.getId());
//		st.setName(dto.getName());
//		st.setPassword(dto.getPassword());
//		st.setUsername(dto.getUsername());
       // StudentApplication st = new StudentApplication();
        ModelMapper mapper = new ModelMapper();
        StudentApplication map = mapper.map(dto, StudentApplication.class);
        return map;
    }
	public List<StudentApplication> dtoToEntity(List<StudentApplicationDto> dto)
	{
		return dto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}

    public StudentApplicationDto entityToDto(StudentApplication studentApplication) {
        //convert entity to dto (data transfer object )
        //method 1
        //StudentApplicationDto dto = new StudentApplicationDto();
        //dto.setApplicationId(studentApplication.getApplicationId());
        //dto.setStatus(studentApplication.getStatus());
        //return dto;
        //method 2
        ModelMapper mapper = new ModelMapper();
        StudentApplicationDto map = mapper.map(studentApplication, StudentApplicationDto.class);
        return map;
    }


}
