package cl.gdl.ms_tipo.service;

import java.util.List;
import java.util.UUID;

import cl.gdl.ms_tipo.dto.TipoDTO;

public interface ITipoService {

    TipoDTO insert(TipoDTO tipo);

    TipoDTO update(UUID idTpo, TipoDTO tipo);

    TipoDTO delete(UUID idTpo);

    TipoDTO getById(UUID idTpo);

    List<TipoDTO> getAll();

}
