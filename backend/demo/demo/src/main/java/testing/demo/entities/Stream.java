package testing.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "streams")
@AllArgsConstructor
@NoArgsConstructor
public class Stream {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="streamId")
    private Long id;
    private String streamName;
    // We're not doing this

<<<<<<< HEAD:backend/demo/demo/src/main/java/testing/demo/model/Stream.java
    //    private String Subject1;
    //    private String Subject2;
    //    private String Subject3;
    //    private String Subject4;
    //    @JsonIgnore
    @ManyToMany(mappedBy = "enrolledStreams")

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id")
    private Subject subject;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "school_id")
    private School school;
=======
>>>>>>> db9abb4a47de7be7c0cc363c5cf5ab39f622ccc7:backend/demo/demo/src/main/java/testing/demo/entities/Stream.java
}
