package com.upb.catalogo.business.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.upb.catalogo.business.models.Libros;

@Service
public interface LibrosService {
    Libros save(Libros libros);

    Libros getLibrosById(String id);

   // Libros getLibrosByAutor(String id);

}
