package com.gemt.ges.business.service;

import com.gemt.ges.business.service.base.BaseService;
import com.gemt.ges.domain.entities.Categoria;
import com.gemt.ges.domain.entities.Empleado;
import com.gemt.ges.domain.entities.Empresa;

import java.util.List;

public interface EmpresaService extends BaseService<Empresa, Long> {
    public List<Empleado> getEmpleados(Long idEmpresa);
    public Categoria addCategoria(Long idEmpresa, Categoria categoria);
}
