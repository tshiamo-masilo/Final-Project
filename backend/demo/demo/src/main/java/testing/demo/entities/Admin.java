package testing.demo.entities;

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
    private Long id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFull_names() {
        return Full_names;
    }

    public void setFull_names(String full_names) {
        Full_names = full_names;
    }

    public int getSchool_id() {
        return School_id;
    }

    public void setSchool_id(int school_id) {
        School_id = school_id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getNumber() {
        return Phone_Number;
    }

    public void setNumber(String number) {
        Phone_Number = number;

    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmployee_no() {
        return Employee_no;
    }

    public void setEmployee_no(String employee_no) {
        Employee_no = employee_no;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", Full_names='" + Full_names + '\'' +
                ", School_id=" + School_id +
                ", Email='" + Email + '\'' +
                ", Username='" + Username + '\'' +
                ", Phone_Number='" + Phone_Number + '\'' +
                ", Password='" + Password + '\'' +
                ", Employee_no='" + Employee_no + '\'' +
                '}';
    }
}
