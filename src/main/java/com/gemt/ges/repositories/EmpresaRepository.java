package com.gemt.ges.repositories;

import com.gemt.ges.domain.entities.Empleado;
import com.gemt.ges.domain.entities.Empresa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpresaRepository extends BaseRepository<Empresa, Long> {

    @Query("SELECT e.empleados FROM Empresa e WHERE e.id = :idEmpresa")
    public List<Empleado> getAllEmpleados(Long idEmpresa);
}
