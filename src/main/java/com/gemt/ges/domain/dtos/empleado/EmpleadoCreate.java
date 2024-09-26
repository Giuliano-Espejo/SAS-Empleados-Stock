package com.gemt.ges.domain.dtos.empleado;

import com.gemt.ges.domain.enums.Rol;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoCreate {
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String email;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaNacimiento;
    private Double sueldo;
    private String password;
    private Rol rol;
}
