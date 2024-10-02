package com.gemt.ges.business.facade;

import com.gemt.ges.business.facade.base.BaseFacade;
import com.gemt.ges.domain.dtos.categoria.CategoriaCreate;
import com.gemt.ges.domain.dtos.categoria.CategoriaDto;
import com.gemt.ges.domain.dtos.empleado.EmpleadoShort;
import com.gemt.ges.domain.dtos.empresa.EmpresaCreate;
import com.gemt.ges.domain.dtos.empresa.EmpresaDto;
import com.gemt.ges.domain.dtos.empresa.EmpresaEdit;
import com.gemt.ges.domain.entities.Categoria;

import java.util.List;

public interface EmpresaFacade extends BaseFacade<EmpresaDto, EmpresaCreate, EmpresaEdit, Long> {
    public List<EmpleadoShort> getEmpleados(Long idEmpresa);
    public CategoriaDto addCategoria(Long idEmpresa, CategoriaCreate categoria);
}
