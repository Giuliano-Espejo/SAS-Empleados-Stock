package com.gemt.ges.business.service.Imp;

import com.gemt.ges.business.service.CategoriaService;
import com.gemt.ges.business.service.EmpresaService;
import com.gemt.ges.business.service.base.BaseServiceImp;
import com.gemt.ges.domain.entities.Categoria;
import com.gemt.ges.domain.entities.Empleado;
import com.gemt.ges.domain.entities.Empresa;
import com.gemt.ges.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaServiceImp extends BaseServiceImp<Empresa, Long> implements EmpresaService {
    @Autowired
    private EmpresaRepository empresaRepository;

    @Autowired
    private CategoriaService categoriaService;

    @Override
    public List<Empleado> getEmpleados(Long idEmpresa) {
        return empresaRepository.getAllEmpleados(idEmpresa);
    }

    @Override
    public Categoria addCategoria(Long idEmpresa, Categoria categoria) {
        var empresa = empresaRepository.getById(idEmpresa);
        var categoriaNew = categoriaService.create(categoria);
        empresa.getCategorias().add(categoriaNew);
        empresaRepository.save(empresa);
        return categoriaNew;
    }
}
