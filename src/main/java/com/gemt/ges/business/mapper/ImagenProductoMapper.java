package com.gemt.ges.business.mapper;

import com.gemt.ges.business.service.CloudinaryService;
import com.gemt.ges.domain.dtos.imagenProducto.ImagenProductoDto;
import com.gemt.ges.domain.entities.ImagenProducto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.web.multipart.MultipartFile;

@Mapper(componentModel = "spring", uses = {CloudinaryService.class})
public interface ImagenProductoMapper extends BaseMapper<ImagenProducto, ImagenProductoDto,ImagenProductoDto,ImagenProductoDto> {
    @Mapping(target = "url", source = "source",  qualifiedByName = "uploadImg")
    @Mapping(target = "nombre", constant = "")
    public ImagenProducto toEntityCreate(MultipartFile source);
}
