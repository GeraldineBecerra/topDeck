package cl.gdl.ms_idioma.service;

import java.util.List;
import java.util.UUID;

import cl.gdl.ms_idioma.dto.IdiomaDTO;

public interface IIdiomaService {

    IdiomaDTO insert(IdiomaDTO idioma);

    IdiomaDTO update(UUID id, IdiomaDTO idioma);

    IdiomaDTO delete(UUID id);

    IdiomaDTO getById(UUID id);

    List<IdiomaDTO> getAll();

}
