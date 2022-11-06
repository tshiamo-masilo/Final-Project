package testing.demo.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class School{
    @Id
    @GeneratedValue()
    @Column(name ="SchoolIdCol")//the school unique number
    private Long SchoolId;
    private String School_Name;
    private String School_Id;
    private String Admin_name;
    private String Admin_Emp_No;
    private String Postal_Address;
    private String Street_name;
    private String Suburb;
    private String City;
    private String Postal_code;

    //relations / table joins
    //one school has one admin
    @OneToOne
    @JoinColumn(name = "AdminIdCol"/*, referencedColumnName="AdminIdCol"*/)
    private Admin admin;

    //One has school has many learners
    @OneToMany
    @JoinColumn(name="StudentIdCol", referencedColumnName = "StudentIdCol")
    private List<Student> student;
}