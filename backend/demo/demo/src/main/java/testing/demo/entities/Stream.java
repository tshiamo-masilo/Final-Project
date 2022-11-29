package testing.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Streams")
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
    @JoinColumn(name = "fkStreamId",referencedColumnName = "streamId")
    private List<Requirements> requirements;


}
