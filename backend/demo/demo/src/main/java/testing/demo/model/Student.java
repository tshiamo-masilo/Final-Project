package testing.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="StudentTbl")
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue()
    @Column(name ="StudentIdCol")
    private Long StudentId;
   // @JoinColumns()
    private String School_id;
    private String Student_id;
    private String Class_id;
    private String grade;
    private String Stream_id;
    private String Name;
    private String surname;
    private String Phone_Number;

    //table joins
    @OneToOne
    @JoinColumn(name ="ApplicationIdCol")
    private StudentApplication application;
    @OneToOne
    @JoinColumn(name="userId")
    private UserCredentials userCredentials;
}