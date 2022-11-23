package testing.demo.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Table(name = "StudentsApplication")
        @NoArgsConstructor
        @AllArgsConstructor

public class StudentApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="StudentId")
    private Long Id;
    private Status status;
    private String FullName ;
    private String Identification;
    private String Gender;
    private String DateOfBirth;
    private String Nationality;
    private String HomeLanguage;
    private String MobileNumber;
    private String GuardianFullName;
    private String GuardianEmail;
    private String GuardianPhoneNumber;
    private String Address;
    private String code;



}
