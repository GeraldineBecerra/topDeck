package cl.gdl.ms_stage.service;

import java.util.List;
import java.util.UUID;

import cl.gdl.ms_stage.dto.StageDTO;

public interface IStageService {

    StageDTO insert(StageDTO stage);

    StageDTO update(UUID id, StageDTO stage);

    StageDTO delete(UUID id);

    StageDTO getById(UUID id);

    List<StageDTO> getAll();

}
