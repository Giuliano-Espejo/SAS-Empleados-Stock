package com.gemt.ges.business.facade.Imp;

import com.gemt.ges.business.facade.ProductoFacade;
import com.gemt.ges.business.facade.base.BaseFacadeImp;
import com.gemt.ges.business.mapper.BaseMapper;
import com.gemt.ges.business.mapper.ProductoMapper;
import com.gemt.ges.business.service.ProductoService;
import com.gemt.ges.business.service.base.BaseService;
import com.gemt.ges.domain.dtos.producto.ProductoCreate;
import com.gemt.ges.domain.dtos.producto.ProductoDto;
import com.gemt.ges.domain.dtos.producto.ProductoEdit;
import com.gemt.ges.domain.entities.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class ProductoFacadeImp extends BaseFacadeImp<Producto, ProductoDto, ProductoCreate, ProductoEdit, Long> implements ProductoFacade {
    public ProductoFacadeImp(BaseService<Producto, Long> baseService, BaseMapper<Producto, ProductoDto, ProductoCreate, ProductoEdit> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private ProductoService productoService;

    @Override
    public List<String> uploadImages(List<MultipartFile> files, Long idProducto) {
        return productoService.uploadImg(files, idProducto);
    }
}
