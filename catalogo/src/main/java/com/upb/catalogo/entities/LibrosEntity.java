package com.upb.catalogo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_libros")
public class LibrosEntity {
    @Id
    private String librosId;
    private String isbn;
    private String name;
    private String genero;

    public String getLibrosId() {
        return librosId;
    }

    public void setLibrosId(String librosId) {
        this.librosId = librosId;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
