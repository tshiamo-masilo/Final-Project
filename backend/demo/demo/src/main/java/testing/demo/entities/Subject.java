package testing.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
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

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "subjectId")
    private Set<Requirements> Requirements = new HashSet<>();

}
