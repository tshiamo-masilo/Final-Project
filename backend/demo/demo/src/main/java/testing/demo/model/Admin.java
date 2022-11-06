package testing.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name ="AdminTable")
@AllArgsConstructor
@NoArgsConstructor
public class Admin implements Serializable {
    @Id
    @GeneratedValue()
    @Column()
    private Long AdminId;
    private String Full_names;
    private int School_id;
    private String Email;
    private String Username;
    private String Phone_Number;
    private String Password;
    private String Employee_no;
}