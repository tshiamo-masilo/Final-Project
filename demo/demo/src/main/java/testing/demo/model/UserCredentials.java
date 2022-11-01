package testing.demo.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="RegisterDetails")
public class UserCredentials {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( nullable = false, updatable = true, unique = true)
    private int id;
    private String Name;
    private String Surname;
    private String Email;
    private String Username;
    private String Phone_Number;
    private String Password;


    public UserCredentials(){

    }
    public UserCredentials(String Name, String surname,String Username,
   String Number,
     String Password){
        this.Name = Name;
        this.Surname = surname;
        this.Username = Username;
        this.Phone_Number = Number;
        this.Password = Password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
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

    @Override
    public String toString() {
        return "UserCredentials{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Email='" + Email + '\'' +
                ", Username='" + Username + '\'' +
                ", Number='" + Phone_Number + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
