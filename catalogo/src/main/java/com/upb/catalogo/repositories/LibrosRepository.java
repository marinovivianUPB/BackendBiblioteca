package com.upb.catalogo.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upb.catalogo.entities.LibrosEntity;

@Repository
public interface LibrosRepository extends JpaRepository<LibrosEntity, String > {

    List<LibrosEntity> findByAutor(String autor);

}
