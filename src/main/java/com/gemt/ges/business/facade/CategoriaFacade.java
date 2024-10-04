package com.gemt.ges.business.facade;

import com.gemt.ges.business.facade.base.BaseFacade;
import com.gemt.ges.domain.dtos.categoria.CategoriaCreate;
import com.gemt.ges.domain.dtos.categoria.CategoriaDto;
import com.gemt.ges.domain.dtos.categoria.CategoriaEdit;
import com.gemt.ges.domain.dtos.categoria.CategoriaShort;

import java.util.List;

public interface CategoriaFacade extends BaseFacade<CategoriaDto, CategoriaCreate, CategoriaEdit, Long> {
    public List<CategoriaShort> findByEmpresaId (Long idEmpresa);
}
