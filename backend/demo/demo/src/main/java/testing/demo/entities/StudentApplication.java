package testing.demo.entities;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "Students_Application")
public class StudentApplication {
    @Id
    @GeneratedValue()
    @Column()
    private Long ApplicationId;
    @Enumerated(EnumType.STRING)
    @ElementCollection(fetch = FetchType.EAGER)
    private Status status;
}
