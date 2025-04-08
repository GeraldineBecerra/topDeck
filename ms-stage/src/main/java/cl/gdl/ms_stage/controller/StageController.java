package cl.gdl.ms_stage.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stage")
public class StageController {
    @Postmapping("/create")
    public StageDTO insert(@RequestBody StageDTO stage){
        return stageService.insert(stage);
    }
    

}
