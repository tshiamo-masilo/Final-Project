package testing.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Students_Details")
public class Student {
    @Id
    @GeneratedValue()
    @Column()
    private Long id;
    private String School_id;
    private String Student_id;
    private String Class_id;
    private String grade;
    private String Stream_id;
    private String Name;
    private String surname;
    private String Phone_Number;

}
