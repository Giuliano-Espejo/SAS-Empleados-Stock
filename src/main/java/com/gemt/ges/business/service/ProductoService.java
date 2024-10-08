package com.gemt.ges.business.service;

import com.gemt.ges.business.service.base.BaseService;
import com.gemt.ges.domain.entities.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ProductoService extends BaseService<Producto, Long> {
    List<String> uploadImg(List<MultipartFile> files, Long idProducto);
    Page<Producto> findAllPage(Pageable pageable);
    Page<Producto> findAllByEmpresaId(Pageable pageable, Long id);
    Page<Producto> findByCategoriaId(Pageable pageable, Long categoriaId);
    Page<Producto> orderByStockMinimo(Pageable pageable, Long empresaId);
    Page<Producto> orderByStockActual(Pageable pageable, Long empresaId);
    Page<Producto> orderByCosto(Pageable pageable, Long empresaId);
    Page<Producto> orderByPrecio(Pageable pageable, Long empresaId);
}
