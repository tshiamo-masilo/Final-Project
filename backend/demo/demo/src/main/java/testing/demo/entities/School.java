package testing.demo.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class School implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="schoolId")
    private Long id;
    private String School_Name;
    private String Admin_name;
    private String Admin_Emp_No;
    private String Postal_Address;
    private String Street_name;
    private String Suburb;
    private String City;
    private String Postal_code;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "school")
    private Set<Stream> Streams = new HashSet<>();
}
