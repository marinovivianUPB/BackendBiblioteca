package com.upb.catalogo.presentacion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import com.upb.catalogo.business.models.Libros;
import com.upb.catalogo.business.services.LibrosService;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibrosController {

    @Qualifier("librosServiceImpl")
    @Autowired
    private LibrosService librosService;

    @PostMapping()
    public Libros save(@RequestBody Libros employee) {
        return librosService.save(employee);
    }


    @GetMapping("/{id}")
    public Libros getEmployeeById(@PathVariable String id) {
        return librosService.getLibrosById(id);
    }

 

}
