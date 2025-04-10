package cl.gdl.ms_condicion.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.gdl.ms_condicion.dto.CondicionDTO;

@Repository
public interface ICondicionRepository extends CrudRepository<CondicionDTO, UUID> {

}
