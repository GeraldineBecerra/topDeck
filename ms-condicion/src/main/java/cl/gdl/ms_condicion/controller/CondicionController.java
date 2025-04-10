package cl.gdl.ms_condicion.controller;

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

import cl.gdl.ms_condicion.dto.CondicionDTO;
import cl.gdl.ms_condicion.service.ICondicionService;

@RestController
@RequestMapping("/api/condicion")
public class CondicionController {

    @Autowired
    ICondicionService condicionService;

    @PostMapping("/insert")
    public CondicionDTO insert(@RequestBody CondicionDTO condicion){
        return condicionService.insert(condicion);
    }
    
    @PutMapping("update/{id}")
    public CondicionDTO update(@PathVariable UUID id, @RequestBody CondicionDTO condicion){
        return condicionService.update(id, condicion);
    }

    @DeleteMapping("delete/{id}")
    public CondicionDTO delete(@PathVariable UUID id){
        return condicionService.delete(id);
    }

    @GetMapping("getById/{id}")
    public CondicionDTO getById(@PathVariable UUID id){
        return condicionService.getById(id);
    }

    @GetMapping
    public List<CondicionDTO> getAll(){
        return condicionService.getAll();
    }
}
