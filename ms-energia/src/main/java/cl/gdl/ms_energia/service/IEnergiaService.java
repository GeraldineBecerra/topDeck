package cl.gdl.ms_energia.service;

import java.util.List;
import java.util.UUID;

import cl.gdl.ms_energia.dto.EnergiaDTO;

public interface IEnergiaService {

    EnergiaDTO insert(EnergiaDTO energia);

    EnergiaDTO update(UUID id, EnergiaDTO energia);

    EnergiaDTO delete(UUID idEnergia);

    EnergiaDTO getById(UUID idEnergia);

    List<EnergiaDTO> getAll();

}
