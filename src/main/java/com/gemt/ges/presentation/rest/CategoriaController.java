package com.gemt.ges.presentation.rest;

import com.gemt.ges.business.facade.Imp.CategoriaFacadeImp;
import com.gemt.ges.domain.dtos.categoria.CategoriaCreate;
import com.gemt.ges.domain.dtos.categoria.CategoriaDto;
import com.gemt.ges.domain.dtos.categoria.CategoriaEdit;
import com.gemt.ges.domain.entities.Categoria;
import com.gemt.ges.presentation.rest.base.BaseControllerImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/categoria")
public class CategoriaController extends BaseControllerImp<Categoria, CategoriaDto, CategoriaCreate, CategoriaEdit, Long, CategoriaFacadeImp> {
    public CategoriaController(CategoriaFacadeImp facade) {
        super(facade);
    }

    @GetMapping("/findByEmpresaId/{idEmpresa}")
    public ResponseEntity<?> findByEmpresaId(@PathVariable Long idEmpresa){
        return ResponseEntity.ok(facade.findByEmpresaId(idEmpresa));
    }
}
