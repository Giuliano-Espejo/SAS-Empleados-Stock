package com.gemt.ges.business.service;

import com.gemt.ges.business.service.base.BaseService;
import com.gemt.ges.domain.entities.Categoria;
import com.gemt.ges.domain.entities.Producto;

import java.util.List;

public interface CategoriaService extends BaseService<Categoria, Long> {
    public void addProducto(Long idCategoria, Producto producto);
    public List<Categoria> findByEmpresaId(Long idEmpresa);
}
