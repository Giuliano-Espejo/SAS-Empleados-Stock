package com.gemt.ges.domain.dtos.categoria;

import com.gemt.ges.domain.dtos.BaseDto;
import com.gemt.ges.domain.dtos.producto.ProductoDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class CategoriaDto extends BaseDto {
    private String denominacion;
    private List<ProductoDto> productos;
}
