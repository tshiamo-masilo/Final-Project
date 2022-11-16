package testing.demo.mapper;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import testing.demo.dto.StudentDto;
import testing.demo.model.Student;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentMapper {
    public List<StudentDto> entityToDto(List<Student> student) {

        return	student.stream().map(x -> entityToDto(x)).collect(Collectors.toList());

    }
    public Student dtoToEntity(Student dto)
    {
//      st.setId(dto.getId());
//		st.setName(dto.getName());
//		st.setPassword(dto.getPassword());
//		st.setUsername(dto.getUsername());
        Student st = new Student();
        ModelMapper mapper = new ModelMapper();
        Student map = mapper.map(dto, Student.class);
        return map;
    }
    public List<Student> dtoToEntity(List<Student> dto)
    {
        return dto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
    }

    public StudentDto entityToDto(Student st) {
        //convert entity to dto (data transfer object )
        //method 1
        //StudentApplicationDto dto = new StudentApplicationDto();
        //dto.setApplicationId(studentApplication.getApplicationId());
        //dto.setStatus(studentApplication.getStatus());
        //return dto;
        //method 2
        ModelMapper mapper = new ModelMapper();
        StudentDto map = mapper.map(st, StudentDto.class);
        return map;
    }

}


/*

private Long StudentId;
    // @JoinColumns()
    private String School_id;
    private String Student_id;
    private String Class_id;
    private String grade;
    private String Stream_id;
    private String Name;
    private String surname;
    private String Phone_Number;
 */