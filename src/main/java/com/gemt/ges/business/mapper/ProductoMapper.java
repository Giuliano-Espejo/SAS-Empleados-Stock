package com.gemt.ges.business.mapper;

import com.gemt.ges.business.service.CategoriaService;
import com.gemt.ges.domain.dtos.producto.ProductoCreate;
import com.gemt.ges.domain.dtos.producto.ProductoDto;
import com.gemt.ges.domain.dtos.producto.ProductoEdit;
import com.gemt.ges.domain.entities.Producto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {CategoriaService.class})
public interface ProductoMapper extends BaseMapper<Producto, ProductoDto, ProductoCreate, ProductoEdit> {
    @Mapping(source = "idCategoria", target = "categoria", qualifiedByName = "getById")
    public Producto toEntityCreate(ProductoCreate source);
}
