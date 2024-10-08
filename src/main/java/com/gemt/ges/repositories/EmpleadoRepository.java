package com.gemt.ges.repositories;

import com.gemt.ges.domain.entities.Empleado;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmpleadoRepository  extends BaseRepository<Empleado, Long> {
    Optional<Empleado> findByEmail(String email);
}
