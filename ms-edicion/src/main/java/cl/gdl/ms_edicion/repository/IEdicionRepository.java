package cl.gdl.ms_edicion.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.gdl.ms_edicion.dto.EdicionDTO;

@Repository
public interface IEdicionRepository extends CrudRepository<EdicionDTO, UUID> {

}
