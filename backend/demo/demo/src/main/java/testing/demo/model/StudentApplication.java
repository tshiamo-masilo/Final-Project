package testing.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ApplicationTable")
@Entity
public class StudentApplication {
    @Id
    @Column(name ="ApplicationIdCol")
    private Long ApplicationId;
    private Status status;
    /*
    Application Data/information
     */
}
