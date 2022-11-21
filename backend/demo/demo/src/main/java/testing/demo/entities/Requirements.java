package testing.demo.entities;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Requirements")
@AllArgsConstructor
@NoArgsConstructor
public class Requirements {
    @Id
    @GeneratedValue()
    @Column()
    private int id;
    private String StreamId;
    private String RequirementsId;
    private String Maths;
    private String NaturalScience;
    private String Technology;
    private String EconomicManagementScience;
    private String ArtAndCulture;
    private String SocialScience;
}
