package com.gemt.ges.business.facade.Imp;

import com.gemt.ges.business.facade.ProductoFacade;
import com.gemt.ges.business.facade.base.BaseFacadeImp;
import com.gemt.ges.business.mapper.BaseMapper;
import com.gemt.ges.business.service.ProductoService;
import com.gemt.ges.business.service.base.BaseService;
import com.gemt.ges.domain.dtos.producto.ProductoCreate;
import com.gemt.ges.domain.dtos.producto.ProductoDto;
import com.gemt.ges.domain.dtos.producto.ProductoEdit;
import com.gemt.ges.domain.entities.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    @Override
    public Page<ProductoDto> findAllPage(Pageable pageable) {
        Page<Producto> productosPage = productoService.findAllPage(pageable);

        // Transformar el Page<Producto> a Page<ProductoDto>
        return productosPage.map(baseMapper::toDTO);
    }

    @Override
    public Page<ProductoDto> findAllByEmpresaId(Pageable pageable, Long idEmpresa) {
        Page<Producto> productosPage = productoService.findAllByEmpresaId(pageable, idEmpresa);

        // Transformar el Page<Producto> a Page<ProductoDto>
        return productosPage.map(baseMapper::toDTO);
    }
}
