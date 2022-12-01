package testing.demo.dtos;

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
