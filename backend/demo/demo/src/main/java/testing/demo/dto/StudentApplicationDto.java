package testing.demo.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import testing.demo.model.Status;

@Data
@NoArgsConstructor
public class StudentApplicationDto {

    private Long ApplicationId;
    private Status status;
}
