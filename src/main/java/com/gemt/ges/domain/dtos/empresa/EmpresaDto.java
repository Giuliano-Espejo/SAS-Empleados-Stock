package com.gemt.ges.domain.dtos.empresa;

import com.gemt.ges.domain.dtos.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class EmpresaDto extends BaseDto {
    private String nombre;
    private Integer cuil;
}
