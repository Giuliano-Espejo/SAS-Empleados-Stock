package com.gemt.ges.domain.dtos.imagenProducto;

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
public class ImagenProductoDto extends BaseDto {
    private String url;
    private String nombre;
}
