package com.gemt.ges.business.mapper;

import com.gemt.ges.domain.dtos.categoria.CategoriaCreate;
import com.gemt.ges.domain.dtos.categoria.CategoriaDto;
import com.gemt.ges.domain.dtos.categoria.CategoriaEdit;
import com.gemt.ges.domain.dtos.categoria.CategoriaShort;
import com.gemt.ges.domain.entities.Categoria;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoriaMapper extends BaseMapper<Categoria, CategoriaDto, CategoriaCreate, CategoriaEdit> {
    public CategoriaShort toShortDto(Categoria source);

    public List<CategoriaShort> toShortDtoList(List<Categoria> source);
}
