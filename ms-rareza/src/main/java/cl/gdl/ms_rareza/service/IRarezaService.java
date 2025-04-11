package cl.gdl.ms_rareza.service;

import java.util.List;
import java.util.UUID;

import cl.gdl.ms_rareza.dto.RarezaDTO;

public interface IRarezaService {

    RarezaDTO insert(RarezaDTO rareza);

    RarezaDTO update(UUID id, RarezaDTO rareza);

    RarezaDTO delete(UUID id);

    RarezaDTO getById(UUID id);

    List<RarezaDTO> getAll();

}
