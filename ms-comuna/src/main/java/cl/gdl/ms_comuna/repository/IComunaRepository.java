package cl.gdl.ms_comuna.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.gdl.ms_comuna.dto.ComunaDTO;

@Repository
public interface IComunaRepository extends CrudRepository<ComunaDTO, UUID> {

    Optional<ComunaDTO> findByNameComunaIgnoreCase(String nameComuna);

}
