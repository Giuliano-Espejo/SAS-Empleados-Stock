package com.gemt.ges.repositories;

import com.gemt.ges.domain.entities.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends BaseRepository<Producto, Long> {
    Page<Producto> findAll(Pageable pageable);

    @Query(value = "SELECT p.* "+
            "FROM producto p "+
            "LEFT JOIN categoria c ON p.categoria_id = c.id "+
            "WHERE c.empresa_id = :empresaId", nativeQuery = true)
    Page<Producto> findByEmpresaId(Pageable pageable, Long empresaId);

}
