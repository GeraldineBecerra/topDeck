package cl.gdl.ms_edicion.service;

import java.util.List;
import java.util.UUID;

import cl.gdl.ms_edicion.dto.EdicionDTO;

public interface IEdicionService {

    EdicionDTO insert(EdicionDTO edicion);

    EdicionDTO update(UUID id, EdicionDTO edicion);

    EdicionDTO delete(UUID id);

    EdicionDTO getById(UUID id);

    List<EdicionDTO> getAll();

}
