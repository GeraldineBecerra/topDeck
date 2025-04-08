package cl.gdl.ms_stage.service.impl;

import java.util.List;
import java.util.UUID;

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

    @Override
    public StageDTO update(UUID id, StageDTO stage) {
        stage.setIdStage(id);
        return stageRepository.save(stage);
    }

    @Override
    public StageDTO delete(UUID id) {
        stageRepository.deleteById(id);
        return null;
    }

    @Override
    public StageDTO getById(UUID id) {
        return stageRepository.findById(id).get();
    }

    @Override
    public List<StageDTO> getAll() {
        return (List<StageDTO>) stageRepository.findAll();
    }



}
