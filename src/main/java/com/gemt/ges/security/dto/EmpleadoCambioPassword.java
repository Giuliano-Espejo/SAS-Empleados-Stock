package com.gemt.ges.security.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class EmpleadoCambioPassword {
    private String email;
    private String password;
    private String newPassword;
}
