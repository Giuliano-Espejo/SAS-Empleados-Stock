package com.gemt.ges.repositories;

import com.gemt.ges.domain.entities.Empleado;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository  extends BaseRepository<Empleado, Long> {
}
