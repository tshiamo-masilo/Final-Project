<<<<<<<< HEAD:backend/demo/demo/src/main/java/testing/demo/dtos/LoginCredentialsDto.java
package testing.demo.dtos;

import javax.persistence.Entity;
========
package testing.demo.entities;
>>>>>>>> f722765197b12232f60b745a303a389dcd5aa915:backend/demo/demo/src/main/java/testing/demo/entities/LoginCredentials.java

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class LoginCredentialsDto {
    private String username;
    private String password;
}
