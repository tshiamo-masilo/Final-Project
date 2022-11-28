package testing.demo.dtos;

import java.util.Date;

import javax.persistence.*;

import testing.demo.entities.User;


@Entity
public class PasswordResetToken {
      private static final int EXPIRATION = 60 * 24;
      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      private Long id;
      private String token;


      @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
      @JoinColumn(nullable = false , name="email")
      private User user;
      private Date expiredDate ;
    
    }
