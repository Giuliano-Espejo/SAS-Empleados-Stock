package com.gemt.ges.domain.entities;

import com.gemt.ges.business.service.CategoriaService;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
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
@Entity
public class Producto extends Base {
    private String nombre;
    private Integer stockMinimo;
    private Integer stockActual;
    private Integer stockMaximo;
    private Double costo;
    private Double precioVenta;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "producto_id")
    private List<ImagenProducto> imagenes;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Categoria categoria;

}
