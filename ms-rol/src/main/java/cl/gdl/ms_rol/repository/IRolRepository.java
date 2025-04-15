package cl.gdl.ms_rol.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.gdl.ms_rol.dto.RolDTO;

@Repository
public interface IRolRepository extends CrudRepository<RolDTO, UUID>{

    Optional<RolDTO> findByNameRolIgnoreCase(String nameRol);

}
