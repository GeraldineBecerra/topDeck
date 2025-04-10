package cl.gdl.ms_tipo.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.gdl.ms_tipo.dto.TipoDTO;

@Repository
public interface ITipoRepository extends CrudRepository<TipoDTO, UUID> {

}
