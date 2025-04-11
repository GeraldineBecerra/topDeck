package cl.gdl.ms_rareza.controller;

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

import cl.gdl.ms_rareza.dto.RarezaDTO;
import cl.gdl.ms_rareza.service.IRarezaService;



@RestController
@RequestMapping("/api/rareza")
public class RarezaController {

    @Autowired
    IRarezaService rarezaService;

    @PostMapping("/insert")
    public RarezaDTO insert(@RequestBody RarezaDTO rareza){
        return rarezaService.insert(rareza);
    }

    @PutMapping("/update/{id}")
    public RarezaDTO update(@PathVariable UUID id, @RequestBody RarezaDTO rareza){
        return rarezaService.update(id,rareza);
    }

    @DeleteMapping("/delete/{id}")
    public RarezaDTO delete(@PathVariable UUID id){
        return rarezaService.delete(id);
    }

    @GetMapping("/getById/{id}")
    public RarezaDTO getById(@PathVariable UUID id){
        return rarezaService.getById(id);
    }

    @GetMapping
    public List<RarezaDTO> getAll(){
        return rarezaService.getAll();
    }



}
