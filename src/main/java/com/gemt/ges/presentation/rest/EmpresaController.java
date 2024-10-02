package com.gemt.ges.presentation.rest;

import com.gemt.ges.business.facade.Imp.EmpresaFacadeImp;
import com.gemt.ges.domain.dtos.categoria.CategoriaCreate;
import com.gemt.ges.domain.dtos.empresa.EmpresaCreate;
import com.gemt.ges.domain.dtos.empresa.EmpresaDto;
import com.gemt.ges.domain.dtos.empresa.EmpresaEdit;
import com.gemt.ges.domain.entities.Empresa;
import com.gemt.ges.presentation.rest.base.BaseControllerImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/empresa")
public class EmpresaController extends BaseControllerImp<Empresa, EmpresaDto, EmpresaCreate, EmpresaEdit, Long, EmpresaFacadeImp> {
    public EmpresaController(EmpresaFacadeImp facade) {
        super(facade);
    }

    @GetMapping("/getEmpleados/{idEmpresa}")
    public ResponseEntity<?> getEmpleados(@PathVariable Long idEmpresa){
        try{
            return ResponseEntity.ok(facade.getEmpleados(idEmpresa));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Error al optener empleados");
        }
    }

    @PostMapping("/addCategoria/{idEmpresa}")
    public ResponseEntity<?> addCategoria(@PathVariable Long idEmpresa, @RequestBody CategoriaCreate categoria){
        try{
            return ResponseEntity.ok(facade.addCategoria(idEmpresa, categoria));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Error al crear categoria");
        }
    }
}
