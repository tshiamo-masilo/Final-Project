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

    public Student() {
    }

    public Student(String school_id, String student_id, String class_id, String grade, String stream_id, String name,
            String surname, String phone_Number) {
        School_id = school_id;
        Student_id = student_id;
        Class_id = class_id;
        this.grade = grade;
        Stream_id = stream_id;
        Name = name;
        this.surname = surname;
        Phone_Number = phone_Number;
    }

}
