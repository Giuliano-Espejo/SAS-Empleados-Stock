package com.gemt.ges.business.facade;

import com.gemt.ges.business.facade.base.BaseFacade;
import com.gemt.ges.domain.dtos.producto.ProductoCreate;
import com.gemt.ges.domain.dtos.producto.ProductoDto;
import com.gemt.ges.domain.dtos.producto.ProductoEdit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public interface ProductoFacade extends BaseFacade<ProductoDto, ProductoCreate, ProductoEdit, Long> {
    List<String> uploadImages(List<MultipartFile> files, Long idProducto);
    Page<ProductoDto> findAllPage(Pageable pageable);
    Page<ProductoDto> findAllByEmpresaId(Pageable pageable, Long idEmpresa);
    Page<ProductoDto> findByCategoriaId(Pageable pageable, Long categoriaId);
    Page<ProductoDto> orderByStockMinimo(Pageable pageable, Long empresaId);
    Page<ProductoDto> orderByStockActual(Pageable pageable, Long empresaId);
    Page<ProductoDto> orderByCosto(Pageable pageable, Long empresaId);
    Page<ProductoDto> orderByPrecio(Pageable pageable, Long empresaId);
}
