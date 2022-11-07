package testing.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="Requirements")
@AllArgsConstructor
@NoArgsConstructor
public class Stream {
    @Id
    @GeneratedValue()
    @Column()
    private int id;
    private String StreamId;
    private String StreamName;
    private String SchoolId;
    private String Subject1;
    private String Subject2;
    private String Subject3;
    private String Subject4;


}
