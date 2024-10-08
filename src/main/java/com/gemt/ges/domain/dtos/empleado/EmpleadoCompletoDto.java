package com.gemt.ges.domain.dtos.empleado;

import com.gemt.ges.domain.dtos.BaseDto;
import com.gemt.ges.domain.enums.Rol;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@SuperBuilder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoCompletoDto extends BaseDto {
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String email;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaNacimiento;
    private Double sueldo;
    private Rol rol;
    private Long idEmpresa;
}
