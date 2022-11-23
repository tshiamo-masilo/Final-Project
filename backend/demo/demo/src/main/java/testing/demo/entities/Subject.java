package testing.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="subjectId")
    private Long id;
    private String Name;
    private String Description;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_subjectId",referencedColumnName = "subjectId")
    private List<Requirements> requirements;

}
