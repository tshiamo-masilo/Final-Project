package testing.demo.model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Required;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="RegisterDetails")
@AllArgsConstructor
@NoArgsConstructor
public class UserCredentials {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( nullable = false, updatable = true, unique = true)
    private int id;
    @NotNull
    private String Name;
    @NotNull
    private String Surname;

    private String Email;
    @NotNull
    private String Username;
    @NotNull
    private String Phone_Number;
    @NotNull
    private String Password;

    private String Role;


}
