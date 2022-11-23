package testing.demo.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class School implements Serializable {
    @Id
    @GeneratedValue()
    @Column()
    private int id;
    private String School_Name;
    private String School_Id;
    private String Admin_name;
    private String Admin_Emp_No;
    private String Postal_Address;
    private String Street_name;
    private String Suburb;
    private String City;
    private String Postal_code;

    public School() {
    }

    public School(String school_Name, String school_Id, String admin_name, String admin_Emp_No, String postal_Address,
            String street_name, String suburb, String city, String postal_code) {
        School_Name = school_Name;
        School_Id = school_Id;
        Admin_name = admin_name;
        Admin_Emp_No = admin_Emp_No;
        Postal_Address = postal_Address;
        Street_name = street_name;
        Suburb = suburb;
        City = city;
        Postal_code = postal_code;
    }

}
