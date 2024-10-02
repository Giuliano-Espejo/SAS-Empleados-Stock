package com.gemt.ges.business.mapper;

import com.gemt.ges.business.service.EmpresaService;
import com.gemt.ges.domain.dtos.empleado.EmpleadoCompletoDto;
import com.gemt.ges.domain.dtos.empleado.EmpleadoCreate;
import com.gemt.ges.domain.dtos.empleado.EmpleadoEdit;
import com.gemt.ges.domain.dtos.empleado.EmpleadoShort;
import com.gemt.ges.domain.entities.Empleado;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {EmpresaService.class})
public interface EmpleadoMapper extends BaseMapper<Empleado, EmpleadoCompletoDto, EmpleadoCreate, EmpleadoEdit> {

    @Mapping(source = "empresa.id", target = "idEmpresa")
    public EmpleadoCompletoDto toDTO(Empleado source);

    @Mapping(source = "idEmpresa", target = "empresa", qualifiedByName = "getById")
    public Empleado toEntityCreate(EmpleadoCreate source);

    public EmpleadoShort toShortDto(Empleado source);

    public List<EmpleadoShort> toShortDtoList(List<Empleado> sources);
}
