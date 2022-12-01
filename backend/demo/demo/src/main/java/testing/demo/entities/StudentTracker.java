package testing.demo.entities;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
public class StudentTracker {
  private final Student student;
  
    
}
