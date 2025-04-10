package cl.gdl.ms_condicion.service;

import java.util.List;
import java.util.UUID;

import cl.gdl.ms_condicion.dto.CondicionDTO;

public interface ICondicionService {

    CondicionDTO insert(CondicionDTO condicion);

    CondicionDTO update(UUID id, CondicionDTO condicion);

    CondicionDTO delete(UUID id);

    CondicionDTO getById(UUID id);

    List<CondicionDTO> getAll();

}
