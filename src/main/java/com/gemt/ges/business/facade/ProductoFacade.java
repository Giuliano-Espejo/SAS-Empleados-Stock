package com.gemt.ges.business.facade;

import com.gemt.ges.business.facade.base.BaseFacade;
import com.gemt.ges.domain.dtos.producto.ProductoCreate;
import com.gemt.ges.domain.dtos.producto.ProductoDto;
import com.gemt.ges.domain.dtos.producto.ProductoEdit;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public interface ProductoFacade extends BaseFacade<ProductoDto, ProductoCreate, ProductoEdit, Long> {
    List<String> uploadImages(List<MultipartFile> files, Long idProducto);
}
