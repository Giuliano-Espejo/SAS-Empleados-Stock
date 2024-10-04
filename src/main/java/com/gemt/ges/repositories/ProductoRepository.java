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

    Page<Producto> findByCategoriaId(Pageable pageable, Long categoriaId);

    @Query(value = "SELECT p.* "+
            "FROM producto p "+
            "LEFT JOIN categoria c ON p.categoria_id = c.id "+
            "WHERE c.empresa_id = :empresaId " +
            "ORDER BY p.stock_minimo ASC", nativeQuery = true)
    Page<Producto> orderByStockMinimo(Pageable pageable, Long empresaId);

    @Query(value = "SELECT p.* "+
            "FROM producto p "+
            "LEFT JOIN categoria c ON p.categoria_id = c.id "+
            "WHERE c.empresa_id = :empresaId " +
            "ORDER BY p.stock_actual ASC", nativeQuery = true)
    Page<Producto> orderByStockActual(Pageable pageable, Long empresaId);

    @Query(value = "SELECT p.* "+
            "FROM producto p "+
            "LEFT JOIN categoria c ON p.categoria_id = c.id "+
            "WHERE c.empresa_id = :empresaId " +
            "ORDER BY p.costo ASC", nativeQuery = true)
    Page<Producto> orderByCosto(Pageable pageable, Long empresaId);

    @Query(value = "SELECT p.* "+
            "FROM producto p "+
            "LEFT JOIN categoria c ON p.categoria_id = c.id "+
            "WHERE c.empresa_id = :empresaId " +
            "ORDER BY p.precio_venta ASC", nativeQuery = true)
    Page<Producto> orderByPrecio(Pageable pageable, Long empresaId);
}
