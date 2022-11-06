package testing.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="RegisterDetails")
@NoArgsConstructor
@AllArgsConstructor
public class UserCredentials {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = true, unique = true)
    private Long UserId;
    private String Name;
    private String Surname;
    private String Email;
    private String Username;
    private String Phone_Number;
    private String Password;

}
