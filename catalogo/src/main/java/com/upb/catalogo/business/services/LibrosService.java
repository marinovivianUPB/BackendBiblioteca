package com.upb.catalogo.business.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.upb.catalogo.business.models.Libros;
import com.upb.catalogo.entities.LibrosEntity;

@Service
public interface LibrosService {
    Libros save(Libros libros);

    Libros getLibrosById(String id);

    List<Libros> getLibrosByAutor(String autor);


}
