package com.gemt.ges.domain.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
public class Empresa extends Base{
    private String nombre;
    private Integer cuil;
    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "empresa_id")
    private Set<Categoria> categorias;
    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "empresa")
    private Set<Empleado> empleados ;
}
