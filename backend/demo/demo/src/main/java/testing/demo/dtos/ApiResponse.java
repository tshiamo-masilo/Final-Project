package testing.demo.dtos;

import org.springframework.http.HttpStatus;

import lombok.*;

@EqualsAndHashCode(of = "uuid")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> {
    private HttpStatus status;
    private String message;
    private T responseObject;
}
