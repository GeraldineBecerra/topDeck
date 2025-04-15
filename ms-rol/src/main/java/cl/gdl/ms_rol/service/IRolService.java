package cl.gdl.ms_rol.service;

import java.util.List;
import java.util.UUID;

import cl.gdl.ms_rol.dto.RolDTO;
import cl.gdl.ms_rol.dto.RolUpdateDTO;

public interface IRolService {

    RolDTO insert(RolDTO rol);

    RolDTO update(UUID id, RolUpdateDTO rol);

    RolDTO delete(UUID id);

    RolDTO getById(UUID id);

    List<RolDTO> getAll();

}
