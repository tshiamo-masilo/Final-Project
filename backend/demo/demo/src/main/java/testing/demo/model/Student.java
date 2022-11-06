package testing.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="Students_Details")
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue()
    @Column()
    private Long StudentId;
    private String School_id;
    private String Student_id;
    private String Class_id;
    private String grade;
    private String Stream_id;
    private String Name;
    private String surname;
    private String Phone_Number;
}