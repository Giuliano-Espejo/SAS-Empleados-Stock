package com.gemt.ges.domain.dtos.categoria;

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
public class CategoriaShort extends BaseDto {
    private String denominacion;
}
