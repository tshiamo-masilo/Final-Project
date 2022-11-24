package testing.demo.security.handler;

import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TokenResponse {
    private String token;
    private String refreshToken;
    public static TokenResponse of(String token, String refreshToken) {
        return new TokenResponse(token, refreshToken);
    }

}