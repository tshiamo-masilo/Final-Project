package testing.demo.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name="Requirements")
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class Requirements {
    @Id
    @GeneratedValue()
    @Column(name="requirementsId")
    private int id;
    private String streamId;
    private String maths;
    private String naturalScience;
    private String technology;
    private String ems;
    private String Arts;
    private String socialScience;
}
