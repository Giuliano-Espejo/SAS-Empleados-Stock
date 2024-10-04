package com.gemt.ges.repositories;

import com.gemt.ges.domain.entities.Categoria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends BaseRepository<Categoria, Long> {
    @Query(value = "SELECT * FROM categoria c WHERE c.empresa_id = :idEmpresa", nativeQuery = true)
    public List<Categoria> findByEmpresaId(Long idEmpresa);
}
