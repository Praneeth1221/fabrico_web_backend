package edu.icet.fabrico_web_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JWTDto {
    private Integer id;
    private String email;
    private String role;
    private  String accountStatus;
    private  String jwtToken;
}
