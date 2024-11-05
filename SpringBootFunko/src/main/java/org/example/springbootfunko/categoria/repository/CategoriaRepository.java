package org.example.springbootfunko.categoria.repository;

import org.example.springbootfunko.categoria.models.Categoria;
import org.example.springbootfunko.categoria.models.TiposCategoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, UUID> {
    Optional<Categoria> findById(UUID id);
    Optional<Categoria> findByNombre(TiposCategoria nombre);
}