package com.gemt.ges.domain.dtos.empleado;

import com.gemt.ges.domain.dtos.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class EmpleadoShort extends BaseDto {
    private String nombre;
    private String apellido;
    private String dni;
}
