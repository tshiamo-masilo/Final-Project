package testing.demo.Security.Handler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TokenResponse {

    private String token;
    private String refreshToken;

    public static TokenResponse of(String token, String refreshToken) {
        return new TokenResponse(token, refreshToken);
    }

}