
package testing.demo.dtos;

import javax.persistence.Entity;




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
