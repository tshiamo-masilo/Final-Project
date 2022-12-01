package testing.demo.dtos;

import lombok.*;
import org.springframework.http.HttpStatus;
import testing.demo.entities.Status;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentApplicationDto {
    private Long ApplicationId;
    private Status status;

    @EqualsAndHashCode(of = "uuid")
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ApiResponse<T> {
        private HttpStatus status;
        private String message;
        private T responseObject;
    }
}
