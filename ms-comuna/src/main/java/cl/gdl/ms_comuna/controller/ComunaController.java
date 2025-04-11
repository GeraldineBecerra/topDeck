package cl.gdl.ms_comuna.controller;

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

import cl.gdl.ms_comuna.dto.ComunaDTO;
import cl.gdl.ms_comuna.service.IComunaService;

@RestController
@RequestMapping("/api/comuna")
public class ComunaController {

    @Autowired
    IComunaService comunaService;

    @PostMapping("/insert")
    public ComunaDTO insert(@RequestBody ComunaDTO comuna){
        return comunaService.insert(comuna);
    }
    
    @PutMapping("update/{id}")
    public ComunaDTO update(@PathVariable UUID id, @RequestBody ComunaDTO comuna){
        return comunaService.update(id, comuna);
    }

    @DeleteMapping("delete/{id}")
    public ComunaDTO delete(@PathVariable UUID id){
        return comunaService.delete(id);
    }

    @GetMapping("getbyid/{id}")
    public ComunaDTO getById(@PathVariable UUID id){
        return comunaService.getById(id);
    }

    @GetMapping
    public List<ComunaDTO> getAll(){
        return comunaService.getAll();
    }
}
