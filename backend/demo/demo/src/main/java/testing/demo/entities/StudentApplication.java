package testing.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Students_Application")
public class StudentApplication {
    @Id
    @GeneratedValue()
    @Column()
    private Long ApplicationId;
    private Status status;
}
