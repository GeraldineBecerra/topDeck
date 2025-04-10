package cl.gdl.ms_categoria.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.gdl.ms_categoria.dto.CategoriaDTO;

@Repository
public interface ICategoriaRepository extends CrudRepository<CategoriaDTO, UUID>{

    CategoriaDTO findByNameCategoria(String nameCategoria);

    Optional<CategoriaDTO> findByNameCategoriaIgnoreCase(String nameCategoria);

}