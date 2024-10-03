package com.gemt.ges.business.service.Imp;

import com.gemt.ges.business.service.CloudinaryService;
import com.gemt.ges.business.service.ProductoService;
import com.gemt.ges.business.service.base.BaseServiceImp;
import com.gemt.ges.domain.entities.ImagenProducto;
import com.gemt.ges.domain.entities.Producto;
import com.gemt.ges.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductoServiceImp extends BaseServiceImp<Producto, Long> implements ProductoService {
    @Autowired
    private CloudinaryService cloudinaryService;
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<String> uploadImg(List<MultipartFile> files, Long idProducto) {
        var producto = super.getById(idProducto);

        // Usar programación funcional para procesar la lista de archivos
        List<ImagenProducto> imagenesSubidas = files.stream()
                .map(file -> {
                    // Usar el servicio de Cloudinary para subir la imagen
                    String url = cloudinaryService.uploadFile(file);

                    // Crear una instancia de ImagenProducto con la URL y el nombre original
                    ImagenProducto imagenProducto = new ImagenProducto();
                    imagenProducto.setUrl(url);
                    imagenProducto.setNombre(file.getOriginalFilename());

                    return imagenProducto; // Retornar el objeto ImagenProducto
                })
                .collect(Collectors.toList()); // Collect para convertir el stream en lista

        // Aquí puedes asociar la lista de imágenes al producto si es necesario
        producto.setImagenes(imagenesSubidas);
        super.update(producto,idProducto);

        // Retornar la lista de imágenes subidas
        return imagenesSubidas.stream()
                .map(ImagenProducto::getUrl) // Extraer las URLs
                .collect(Collectors.toList());
    }

    @Override
    public Page<Producto> findAllPage(Pageable pageable) {
        return baseRepository.findAll(pageable);
    }

    @Override
    public Page<Producto> findAllByEmpresaId(Pageable pageable, Long id) {
        return productoRepository.findByEmpresaId(pageable, id);
    }
}
