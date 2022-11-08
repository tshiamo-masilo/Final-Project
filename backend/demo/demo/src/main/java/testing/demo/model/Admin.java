package testing.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import javax.persistence.ConstructorResult;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name ="AdminTbl")
@AllArgsConstructor
@NoArgsConstructor
public class Admin{
    @Id
    @GeneratedValue()
    @Column(name = "AdminIdCol")
    private Long AdminId;
    private String Full_names;
    private int School_id;
    private String Email;
    private String Username;
    private String Phone_Number;
    private String Password;
    private String Employee_no;
}