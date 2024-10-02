package com.gemt.ges.business.service.base;

import com.gemt.ges.domain.entities.Base;
import org.mapstruct.Named;

import java.io.Serializable;
import java.util.List;

public interface BaseService <E extends Base, ID extends Serializable> {
    public E create(E request);

    public List<E> getAll();

    public void deleteById(ID id);

    public E update(E request, ID id);

    @Named("getById")
    public E getById(ID id);
}
