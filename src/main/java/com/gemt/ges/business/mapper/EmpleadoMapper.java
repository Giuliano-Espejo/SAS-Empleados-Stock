package com.gemt.ges.business.mapper;

import com.gemt.ges.business.service.CloudinaryService;
import com.gemt.ges.domain.dtos.empleado.EmpleadoCompletoDto;
import com.gemt.ges.domain.dtos.empleado.EmpleadoCreate;
import com.gemt.ges.domain.dtos.empleado.EmpleadoEdit;
import com.gemt.ges.domain.entities.Empleado;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {CloudinaryService.class})
public interface EmpleadoMapper extends BaseMapper<Empleado, EmpleadoCompletoDto, EmpleadoCreate, EmpleadoEdit> {
}
