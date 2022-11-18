package testing.demo.entities;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Requirements")
<<<<<<< HEAD:backend/demo/demo/src/main/java/testing/demo/model/Requirements.java
@AllArgsConstructor(staticName = "build")
=======
@AllArgsConstructor
>>>>>>> db9abb4a47de7be7c0cc363c5cf5ab39f622ccc7:backend/demo/demo/src/main/java/testing/demo/entities/Requirements.java
@NoArgsConstructor
public class Requirements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="requirementsId",nullable = false)
    private int id;
    private String maths;
    private String naturalScience;
    private String technology;
    private String ems;
    private String arts;
    private String socialScience;

    @OneToOne
    @JoinColumn(name = "streamId")
    private Stream stream;

}
