package testing.demo.model;

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
    private  int id;
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

    public School(String school_Name, String school_Id, String admin_name, String admin_Emp_No, String postal_Address, String street_name, String suburb, String city, String postal_code) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchool_Name() {
        return School_Name;
    }

    public void setSchool_Name(String school_Name) {
        School_Name = school_Name;
    }

    public String getSchool_Id() {
        return School_Id;
    }

    public void setSchool_Id(String school_Id) {
        School_Id = school_Id;
    }

    public String getAdmin_name() {
        return Admin_name;
    }

    public void setAdmin_name(String admin_name) {
        Admin_name = admin_name;
    }

    public String getAdmin_Emp_No() {
        return Admin_Emp_No;
    }

    public void setAdmin_Emp_No(String admin_Emp_No) {
        Admin_Emp_No = admin_Emp_No;
    }

    public String getPostal_Address() {
        return Postal_Address;
    }

    public void setPostal_Address(String postal_Address) {
        Postal_Address = postal_Address;
    }

    public String getStreet_name() {
        return Street_name;
    }

    public void setStreet_name(String street_name) {
        Street_name = street_name;
    }

    public String getSuburb() {
        return Suburb;
    }

    public void setSuburb(String suburb) {
        Suburb = suburb;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getPostal_code() {
        return Postal_code;
    }

    public void setPostal_code(String postal_code) {
        Postal_code = postal_code;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", School_Name='" + School_Name + '\'' +
                ", School_Id='" + School_Id + '\'' +
                ", Admin_name='" + Admin_name + '\'' +
                ", Admin_Emp_No='" + Admin_Emp_No + '\'' +
                ", Postal_Address='" + Postal_Address + '\'' +
                ", Street_name='" + Street_name + '\'' +
                ", Suburb='" + Suburb + '\'' +
                ", City='" + City + '\'' +
                ", Postal_code='" + Postal_code + '\'' +
                '}';
    }
}
