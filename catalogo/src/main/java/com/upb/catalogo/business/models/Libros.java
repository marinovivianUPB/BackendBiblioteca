package com.upb.catalogo.business.models;
import java.util.List;


public class Libros {
    private String librosId;
    private String isbn;
    private String autor;
    private String name;
    private String genero;
    private List<String> tags;


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


    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
