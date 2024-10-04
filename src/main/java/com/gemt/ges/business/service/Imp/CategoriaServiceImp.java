package com.gemt.ges.business.service.Imp;

import com.gemt.ges.business.service.CategoriaService;
import com.gemt.ges.business.service.ProductoService;
import com.gemt.ges.business.service.base.BaseServiceImp;
import com.gemt.ges.domain.entities.Categoria;
import com.gemt.ges.domain.entities.Producto;
import com.gemt.ges.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImp extends BaseServiceImp<Categoria, Long> implements CategoriaService {

    @Autowired
    private ProductoService productoService;

    @Autowired
    private CategoriaRepository categoriaRepository;


    @Override
    public void addProducto(Long idCategoria, Producto producto ) {
        var categoria = categoriaRepository.getById(idCategoria);
        categoria.getProductos().add(producto);
        super.update(categoria, idCategoria);
    }

    @Override
    public List<Categoria> findByEmpresaId(Long idEmpresa) {
        return categoriaRepository.findByEmpresaId(idEmpresa);
    }
}
