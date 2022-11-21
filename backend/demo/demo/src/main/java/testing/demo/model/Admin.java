package testing.demo.model;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "AdminTable")
public class Admin implements Serializable {
    @Id
    @GeneratedValue()
    @Column()
    private int id;
    private String Full_names;
    private int School_id;
    private String Email;
    private String Username;
    private String Phone_Number;
    private String Password;
    private String Employee_no;

    public Admin() {

    }

    public Admin(String full_names, int school_id, String email, String username, String number, String password,
            String employee_no) {
        Full_names = full_names;
        School_id = school_id;
        Email = email;
        Username = username;
        Phone_Number = number;
        Password = password;
        Employee_no = employee_no;
    }

}
