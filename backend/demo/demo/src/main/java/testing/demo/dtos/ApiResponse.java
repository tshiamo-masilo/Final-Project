<<<<<<<< HEAD:backend/demo/demo/src/main/java/testing/demo/entities/ApiResponse.java
package testing.demo.entities;
========
package testing.demo.dtos;
>>>>>>>> f722765197b12232f60b745a303a389dcd5aa915:backend/demo/demo/src/main/java/testing/demo/dtos/ApiResponse.java

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
