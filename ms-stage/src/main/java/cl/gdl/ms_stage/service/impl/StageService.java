package cl.gdl.ms_stage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gdl.ms_stage.dto.StageDTO;
import cl.gdl.ms_stage.repository.IStageRepository;
import cl.gdl.ms_stage.service.IStageService;

@Service
public class StageService implements IStageService{
    
    @Autowired
    IStageRepository stageRepository;

    @Override
    public StageDTO insert(StageDTO stage) {

        return stageRepository.save(stage);
    }

    // @Override
    // public StageDTO update(UUID id, StageDTO stage) {

    //     stage.setIdStage(id);
    //     return stageRepository.save(stage);
    // }

}
