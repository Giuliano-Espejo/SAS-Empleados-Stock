package com.gemt.ges.domain.entities;

import com.gemt.ges.domain.enums.Rol;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Empleado extends Base{
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    @Email(message = "El formato del correo es inválido")
    private String email;
    private LocalDate fechaNacimiento;
    private Double sueldo;
    private String password;
    private Rol rol;
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Empresa empresa;
}
