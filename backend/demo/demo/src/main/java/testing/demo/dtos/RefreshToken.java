package testing.demo.dtos;

import lombok.*;
import testing.demo.entities.User;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.UUID;

@EqualsAndHashCode(of = "uuid")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RefreshToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Builder.Default
    private String uuid = UUID.randomUUID().toString();

    @Column
    private String token;

    @Column
    private ZonedDateTime expiration;

    @OneToOne
    @JoinColumn(nullable = false, name = "user_id")
    private User user;

}