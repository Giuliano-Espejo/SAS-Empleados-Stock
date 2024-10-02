package com.gemt.ges.business.mapper;

import com.gemt.ges.domain.dtos.empresa.EmpresaCreate;
import com.gemt.ges.domain.dtos.empresa.EmpresaDto;
import com.gemt.ges.domain.dtos.empresa.EmpresaEdit;
import com.gemt.ges.domain.entities.Empresa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {CategoriaMapper.class, EmpleadoMapper.class})
public interface EmpresaMapper extends BaseMapper<Empresa, EmpresaDto, EmpresaCreate, EmpresaEdit> {
}
