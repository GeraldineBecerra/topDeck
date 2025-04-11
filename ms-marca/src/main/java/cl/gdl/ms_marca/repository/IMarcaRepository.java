package cl.gdl.ms_marca.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.gdl.ms_marca.dto.MarcaDTO;

@Repository
public interface IMarcaRepository extends CrudRepository<MarcaDTO, UUID> {
    MarcaDTO findByNameMarca(String nameMarca);

    Optional<MarcaDTO> findByNameMarcaIgnoreCase(String nameMarca);


}
