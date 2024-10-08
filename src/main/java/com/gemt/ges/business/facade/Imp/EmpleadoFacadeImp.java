package com.gemt.ges.business.facade.Imp;

import com.gemt.ges.business.facade.EmpleadoFacade;
import com.gemt.ges.business.facade.base.BaseFacadeImp;
import com.gemt.ges.business.mapper.BaseMapper;
import com.gemt.ges.business.service.base.BaseService;
import com.gemt.ges.domain.dtos.empleado.EmpleadoCompletoDto;
import com.gemt.ges.security.dto.EmpleadoCreate;
import com.gemt.ges.domain.dtos.empleado.EmpleadoEdit;
import com.gemt.ges.domain.entities.Empleado;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoFacadeImp extends BaseFacadeImp<Empleado, EmpleadoCompletoDto, EmpleadoCreate, EmpleadoEdit, Long> implements EmpleadoFacade {
    public EmpleadoFacadeImp(BaseService<Empleado, Long> baseService, BaseMapper<Empleado, EmpleadoCompletoDto, EmpleadoCreate, EmpleadoEdit> baseMapper) {
        super(baseService, baseMapper);
    }

}
