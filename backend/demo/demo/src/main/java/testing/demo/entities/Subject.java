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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;
    private String Description;
//    (fetch = FetchType.LAZY, mappedBy = "subject")
    @ManyToMany
    @JoinTable(name="EnrolledStreams",
    joinColumns =@JoinColumn(name="subjectId"),
    inverseJoinColumns = @JoinColumn(name="StreamId"))
    private Set<Stream> enrolledStreams = new HashSet<>();

    public void enrolledStream(Stream stream) {
        enrolledStreams.add(stream);
    }
}
