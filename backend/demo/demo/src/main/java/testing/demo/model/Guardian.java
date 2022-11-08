package testing.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Guardian")
public class Guardian {
    @javax.persistence.Id
    @GeneratedValue()
    @Column()
    private int Id;
    private String FirstName;
    private String LastName;
    private String email;
    private String HomeAddress;
    private String PhoneNumber;

    public Guardian() {
    }
    public Guardian(String firstName, String lastName, String email, String homeAddress, String phoneNumber) {
        FirstName = firstName;
        LastName = lastName;
        this.email = email;
        HomeAddress = homeAddress;
        PhoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAddress() {
        return HomeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        HomeAddress = homeAddress;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Guardian{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", email='" + email + '\'' +
                ", HomeAddress='" + HomeAddress + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
    }
}
