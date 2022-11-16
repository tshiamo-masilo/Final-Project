package testing.demo.dtos;

import lombok.*;
import testing.demo.entities.Status;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentApplicationDto {
    private Long ApplicationId;
    private Status status;
}
