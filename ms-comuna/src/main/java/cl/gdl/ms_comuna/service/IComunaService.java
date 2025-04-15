package cl.gdl.ms_comuna.service;

import java.util.List;
import java.util.UUID;

import cl.gdl.ms_comuna.dto.ComunaDTO;

public interface IComunaService {

    ComunaDTO insert(ComunaDTO comuna);

    ComunaDTO update(UUID id, ComunaDTO comuna);

    ComunaDTO delete(UUID id);

    ComunaDTO getById(UUID id);

    List<ComunaDTO> getAll();

}
