package testing.demo.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Students_Details")
public class Student {
    @Id
    @GeneratedValue()
    @Column()
    private int id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchool_id() {
        return School_id;
    }

    public void setSchool_id(String school_id) {
        School_id = school_id;
    }

    public String getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(String student_id) {
        Student_id = student_id;
    }

    public String getClass_id() {
        return Class_id;
    }

    public void setClass_id(String class_id) {
        Class_id = class_id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getStream_id() {
        return Stream_id;
    }

    public void setStream_id(String stream_id) {
        Stream_id = stream_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        Phone_Number = phone_Number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", School_id='" + School_id + '\'' +
                ", Student_id='" + Student_id + '\'' +
                ", Class_id='" + Class_id + '\'' +
                ", grade='" + grade + '\'' +
                ", Stream_id='" + Stream_id + '\'' +
                ", Name='" + Name + '\'' +
                ", surname='" + surname + '\'' +
                ", Phone_Number='" + Phone_Number + '\'' +
                '}';
    }
}
