package com.gemt.ges.repositories;

import com.gemt.ges.domain.entities.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends BaseRepository<Producto, Long> {
    Page<Producto> findAll(Pageable pageable);
}
