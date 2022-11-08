package testing.demo.dto;

import lombok.Builder;
import testing.demo.model.Status;

@Builder
public class StudentApplicationDto {

    private Long ApplicationId;
    private Status status;
}
