package com.upb.catalogo.business.models;


public class Libros {
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
