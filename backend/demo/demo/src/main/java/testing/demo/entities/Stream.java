package testing.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

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


    c

}
