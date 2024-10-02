package com.gemt.ges.presentation.rest;

import com.gemt.ges.business.facade.Imp.ProductoFacadeImp;
import com.gemt.ges.domain.dtos.producto.ProductoCreate;
import com.gemt.ges.domain.dtos.producto.ProductoDto;
import com.gemt.ges.domain.dtos.producto.ProductoEdit;
import com.gemt.ges.domain.entities.Producto;
import com.gemt.ges.presentation.rest.base.BaseControllerImp;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import org.springframework.data.domain.Pageable;
import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/producto")
public class ProductoController extends BaseControllerImp<Producto, ProductoDto, ProductoCreate, ProductoEdit, Long, ProductoFacadeImp> {
    public ProductoController(ProductoFacadeImp facade) {
        super(facade);
    }

    @PostMapping("/uploads")
    public ResponseEntity<List<String>> uploadImages(
            @RequestParam(value = "uploads", required = true) List<MultipartFile> files,
            @RequestParam(value = "idProducto", required = true) Long idProducto) {
        try {
            return ResponseEntity.ok(facade.uploadImages(files, idProducto));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(null);
        }
    }

    @GetMapping("/getAllPage")
    public ResponseEntity<Page<ProductoDto>> getAllProductos(Pageable pageable) {
        Page<ProductoDto> productosDtoPage = facade.findAllPage(pageable);
        return ResponseEntity.ok(productosDtoPage);
    }

}
