package testing.demo.dto;

import lombok.*;
import testing.demo.model.Status;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentApplicationDto {
    private Long ApplicationId;
    private Status status;
}
