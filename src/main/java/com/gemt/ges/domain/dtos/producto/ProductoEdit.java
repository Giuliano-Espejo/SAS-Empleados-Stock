package com.gemt.ges.domain.dtos.producto;

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
public class ProductoEdit {
    private Integer stockMinimo;
    private Integer stockActual;
    private Integer stockMaximo;
    private Double costo;
    private Double precioVenta;
}
