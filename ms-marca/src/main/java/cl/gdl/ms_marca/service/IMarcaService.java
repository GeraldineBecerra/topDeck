package cl.gdl.ms_marca.service;

import java.util.List;
import java.util.UUID;

import cl.gdl.ms_marca.dto.MarcaDTO;

public interface IMarcaService {

    MarcaDTO insert(MarcaDTO marca);

    MarcaDTO update(UUID id, MarcaDTO marca);

    MarcaDTO delete(UUID id);

    List<MarcaDTO> getAll();

    MarcaDTO getById(UUID id);

}
