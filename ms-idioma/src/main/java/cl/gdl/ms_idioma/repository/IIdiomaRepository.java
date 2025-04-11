package cl.gdl.ms_idioma.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.gdl.ms_idioma.dto.IdiomaDTO;

@Repository
public interface IIdiomaRepository extends CrudRepository<IdiomaDTO, UUID>{
   
    IdiomaDTO findByNameIdioma(String nameIdioma);
    
    Optional<IdiomaDTO> findByNameIdiomaIgnoreCase(String nameIdioma);

}
