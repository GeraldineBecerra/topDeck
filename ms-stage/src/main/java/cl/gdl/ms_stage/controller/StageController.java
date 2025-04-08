package cl.gdl.ms_stage.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gdl.ms_stage.dto.StageDTO;
import cl.gdl.ms_stage.service.IStageService;

@RestController
@RequestMapping("/api/stage")
public class StageController {

    @Autowired
    IStageService stageService;

    @PostMapping
    public StageDTO insert(@RequestBody StageDTO stage){
        return stageService.insert(stage);
    }
    
    @PutMapping("/{id}")
    public StageDTO update(@PathVariable UUID id, @RequestBody StageDTO stage){
        return stageService.update(id,stage);
    }

    @DeleteMapping("/{id}")
    public StageDTO delete(@PathVariable UUID id){
        return stageService.delete(id);
    }

    @GetMapping("/{id}")
    public StageDTO getById(@PathVariable UUID id){
        return stageService.getById(id);
    }

    @GetMapping
    public List<StageDTO> getAll(){
        return stageService.getAll();
    }


}
