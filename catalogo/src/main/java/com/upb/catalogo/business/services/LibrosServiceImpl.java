package com.upb.catalogo.business.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upb.catalogo.business.models.Libros;
import com.upb.catalogo.entities.LibrosEntity;
import com.upb.catalogo.repositories.LibrosRepository;

import java.util.UUID;

@Service
public class LibrosServiceImpl implements LibrosService{
    @Autowired
    private LibrosRepository librosRepository;

    @Override
    public Libros save(Libros libros) {
        if(libros.getLibrosId() == null) {
            libros.setLibrosId(UUID.randomUUID().toString());
        }
        LibrosEntity entity  = new LibrosEntity();
        BeanUtils.copyProperties(libros,entity);
        librosRepository.save(entity);
        // Optional<EmployeeEntity> employee1 = employeeRepository.findById("12313");
        return libros;
    }


    @Override
    public Libros getLibrosById(String id) {
        LibrosEntity librosEntity =
                this.librosRepository
                        .findById(id)
                        .get();
        Libros libros = new Libros();
        BeanUtils.copyProperties(librosEntity, libros);
        return libros;
    }
/*
   @Override
    public Libros getLibrosByAutor(String autor) {
        LibrosEntity librosEntity =
                this.librosRepository
                        .findById(id)
                        .get();
        Libros libros = new Libros();
        BeanUtils.copyProperties(librosEntity, libros);
        return libros;
    } */
}

