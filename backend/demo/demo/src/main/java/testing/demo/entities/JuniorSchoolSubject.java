package testing.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="JuniorSchoolSubjects")
public class JuniorSchoolSubject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="subjectId")
    private Long id;
    private String Name;
    private String Description;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fkSubjectId",referencedColumnName = "subjectId")
    private List<Requirements> requirements;

}
