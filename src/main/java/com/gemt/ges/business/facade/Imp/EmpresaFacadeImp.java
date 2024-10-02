package com.gemt.ges.business.facade.Imp;

import com.gemt.ges.business.facade.EmpresaFacade;
import com.gemt.ges.business.facade.base.BaseFacadeImp;
import com.gemt.ges.business.mapper.BaseMapper;
import com.gemt.ges.business.mapper.CategoriaMapper;
import com.gemt.ges.business.mapper.EmpleadoMapper;
import com.gemt.ges.business.service.EmpresaService;
import com.gemt.ges.business.service.base.BaseService;
import com.gemt.ges.domain.dtos.categoria.CategoriaCreate;
import com.gemt.ges.domain.dtos.categoria.CategoriaDto;
import com.gemt.ges.domain.dtos.empleado.EmpleadoShort;
import com.gemt.ges.domain.dtos.empresa.EmpresaCreate;
import com.gemt.ges.domain.dtos.empresa.EmpresaDto;
import com.gemt.ges.domain.dtos.empresa.EmpresaEdit;
import com.gemt.ges.domain.entities.Categoria;
import com.gemt.ges.domain.entities.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaFacadeImp extends BaseFacadeImp<Empresa, EmpresaDto, EmpresaCreate, EmpresaEdit, Long> implements EmpresaFacade {
    public EmpresaFacadeImp(BaseService<Empresa, Long> baseService, BaseMapper<Empresa, EmpresaDto, EmpresaCreate, EmpresaEdit> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private EmpleadoMapper empleadoMapper;

    @Autowired
    private EmpresaService empresaService;

    @Autowired
    private CategoriaMapper categoriaMapper;

    @Override
    public List<EmpleadoShort> getEmpleados(Long idEmpresa) {
        return empleadoMapper.toShortDtoList(empresaService.getEmpleados(idEmpresa));
    }

    @Override
    public CategoriaDto addCategoria(Long idEmpresa, CategoriaCreate categoria) {
        return categoriaMapper.toDTO(empresaService.addCategoria(idEmpresa, categoriaMapper.toEntityCreate(categoria)));
    }
}
