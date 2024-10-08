package com.gemt.ges.business.facade;

import com.gemt.ges.business.facade.base.BaseFacade;
import com.gemt.ges.domain.dtos.empleado.EmpleadoCompletoDto;
import com.gemt.ges.security.dto.EmpleadoCreate;
import com.gemt.ges.domain.dtos.empleado.EmpleadoEdit;

public interface EmpleadoFacade extends BaseFacade<EmpleadoCompletoDto, EmpleadoCreate, EmpleadoEdit, Long> {
}
