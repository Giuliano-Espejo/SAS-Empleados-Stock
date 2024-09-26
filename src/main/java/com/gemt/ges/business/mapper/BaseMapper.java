package com.gemt.ges.business.mapper;


import com.gemt.ges.domain.dtos.BaseDto;
import com.gemt.ges.domain.entities.Base;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BaseMapper<E extends Base, D extends BaseDto, DC, DE> {
    public D toDTO(E source);
    public E toEntityCreate(DC source);
    //@MappingTarget se utiliza para reemplazar los atributos del dto sobre la entidad
    public E toUpdate(@MappingTarget E entity, DE source);
    public List<D> toDTOsList(List<E> source);
}
