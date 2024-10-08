package com.gemt.ges.domain.entities;

import com.gemt.ges.domain.enums.Rol;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Empleado extends Base implements UserDetails {
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

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() { //que rol tiene mi usuario
        return List.of(new SimpleGrantedAuthority((rol.name())));
    }

    @Override
    public String getUsername() {
        return email;
    }

}
