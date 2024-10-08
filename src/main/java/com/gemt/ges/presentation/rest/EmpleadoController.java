package com.gemt.ges.presentation.rest;


import com.gemt.ges.business.facade.Imp.EmpleadoFacadeImp;
import com.gemt.ges.domain.dtos.empleado.EmpleadoCompletoDto;
import com.gemt.ges.security.dto.EmpleadoCreate;
import com.gemt.ges.domain.dtos.empleado.EmpleadoEdit;
import com.gemt.ges.domain.entities.Empleado;
import com.gemt.ges.presentation.rest.base.BaseControllerImp;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empleado")
@CrossOrigin("*")
public class EmpleadoController extends BaseControllerImp<Empleado, EmpleadoCompletoDto, EmpleadoCreate, EmpleadoEdit, Long, EmpleadoFacadeImp> {
    public EmpleadoController(EmpleadoFacadeImp facade) {
        super(facade);
    }

}
