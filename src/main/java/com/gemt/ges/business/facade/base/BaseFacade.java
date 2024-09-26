package com.gemt.ges.business.facade.base;

import com.gemt.ges.domain.dtos.BaseDto;

import java.io.Serializable;
import java.util.List;

public interface BaseFacade <D extends BaseDto, DC, DE, ID extends Serializable>{
    public D createNew(DC request);
    public D getById(Long id);
    public List<D> getAll();
    public void deleteById(Long id);
    public D update(DE request, Long id);
}
