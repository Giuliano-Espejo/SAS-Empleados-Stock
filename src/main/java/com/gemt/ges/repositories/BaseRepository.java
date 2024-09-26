package com.gemt.ges.repositories;

import com.gemt.ges.domain.entities.Base;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {

    @Override
    @Transactional
    default void delete(E entity) {
        entity.setEliminado(true);
        save(entity);
    }

    @Override
    default E getById(ID id){
        var optionalEntity = findById(id);

        if (optionalEntity.isEmpty()){
            String errMsg = "La entidad con el id " + id + " se encuentra borrada logicamente";
            throw new RuntimeException(errMsg);
        }

        var entity = optionalEntity.get();
        if(entity.isEliminado()){
            String errMsg = "La entidad del tipo " + entity.getClass().getSimpleName() + " con el id " + id + " se encuentra borrada logicamente";
            throw new RuntimeException(errMsg);
        }
        return entity;
    }

    default List<E> getAll(){
        var entities = findAll().stream().filter(e -> !e.isEliminado()).toList();
        return entities;
    }
}
