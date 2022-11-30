package testing.demo.entities;

import lombok.*;

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
}
