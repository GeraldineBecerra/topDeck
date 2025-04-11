package cl.gdl.ms_energia.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.gdl.ms_energia.dto.EnergiaDTO;

@Repository
public interface IEnergiaRepository extends CrudRepository<EnergiaDTO, UUID>{

}
