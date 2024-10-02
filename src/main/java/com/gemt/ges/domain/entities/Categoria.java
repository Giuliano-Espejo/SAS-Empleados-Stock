package com.gemt.ges.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Where;

import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Categoria extends Base{

    private String denominacion;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria")
    @Where(clause = "eliminado = false")//se usa @Where para traer solo los productos que tengan eliminado en false
    private Set<Producto> productos;
}
