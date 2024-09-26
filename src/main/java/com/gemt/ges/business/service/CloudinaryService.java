package com.gemt.ges.business.service;

import org.mapstruct.Named;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

// Interfaz que define los métodos para interactuar con Cloudinary
public interface CloudinaryService {

    // Método para subir un archivo a Cloudinary
    @Named("uploadImg")
    public default String uploadFile(MultipartFile file) {
        return null; // Implementación por defecto que retorna null
    }

    // Método para eliminar una imagen de Cloudinary
    @Named("deleteImg")
    public ResponseEntity<String> deleteImage(String publicId, Long id);
}
