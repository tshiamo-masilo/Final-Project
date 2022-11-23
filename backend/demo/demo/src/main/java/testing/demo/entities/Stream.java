package testing.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "streams")
@AllArgsConstructor
@NoArgsConstructor
public class Stream {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="streamId")
    private Long id;
    private String streamName;
    private String description;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_streamId",referencedColumnName = "streamId")
    private List<Requirements> requirements;


}
