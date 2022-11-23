package testing.demo.entities;
import testing.demo.entities.Subject;
import testing.demo.entities.Stream;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Requirements")
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class Requirements {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="requirementId")
    private Long id;
    private String level;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "streamId")
//    private Stream stream;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "subjectId")
//    private Subject subject;

}