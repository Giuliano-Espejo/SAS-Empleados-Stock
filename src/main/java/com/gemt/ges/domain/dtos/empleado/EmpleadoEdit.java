package com.gemt.ges.domain.dtos.empleado;

import com.gemt.ges.domain.enums.Rol;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoEdit {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private Double sueldo;
    private Rol rol;
}