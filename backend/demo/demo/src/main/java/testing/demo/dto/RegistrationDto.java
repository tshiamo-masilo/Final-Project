package testing.demo.dto;

import javax.persistence.*;
import java.util.UUID;


import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationDto {

    private String name;
    private String surname;
    private String email;
    private String username;
    private String password;
    private String confirmPassword;
}
