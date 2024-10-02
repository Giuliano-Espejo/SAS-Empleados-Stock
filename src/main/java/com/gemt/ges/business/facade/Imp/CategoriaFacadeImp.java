package com.gemt.ges.business.facade.Imp;

import com.gemt.ges.business.facade.CategoriaFacade;
import com.gemt.ges.business.facade.base.BaseFacadeImp;
import com.gemt.ges.business.mapper.BaseMapper;
import com.gemt.ges.business.service.CategoriaService;
import com.gemt.ges.business.service.base.BaseService;
import com.gemt.ges.domain.dtos.categoria.CategoriaCreate;
import com.gemt.ges.domain.dtos.categoria.CategoriaDto;
import com.gemt.ges.domain.dtos.categoria.CategoriaEdit;
import com.gemt.ges.domain.entities.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaFacadeImp extends BaseFacadeImp<Categoria, CategoriaDto, CategoriaCreate, CategoriaEdit, Long> implements CategoriaFacade {
    public CategoriaFacadeImp(BaseService<Categoria, Long> baseService, BaseMapper<Categoria, CategoriaDto, CategoriaCreate, CategoriaEdit> baseMapper) {
        super(baseService, baseMapper);
    }
}
