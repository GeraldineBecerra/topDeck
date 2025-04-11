package cl.gdl.ms_rareza.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.gdl.ms_rareza.dto.RarezaDTO;

@Repository
public interface IRarezaRepository extends CrudRepository<RarezaDTO, UUID> {

}
