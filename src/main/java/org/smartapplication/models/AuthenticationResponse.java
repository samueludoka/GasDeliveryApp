package org.smartapplication.models;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class AuthenticationResponse {
    private String token;
}
