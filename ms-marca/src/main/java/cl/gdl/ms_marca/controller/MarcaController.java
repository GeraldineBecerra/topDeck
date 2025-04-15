package cl.gdl.ms_marca.controller;

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

import cl.gdl.ms_marca.dto.MarcaDTO;
import cl.gdl.ms_marca.service.IMarcaService;


@RestController
@RequestMapping("/api/marca")
public class MarcaController {

    @Autowired
    IMarcaService marcaService;
    
    @PostMapping("/insert")
    public MarcaDTO insert(@RequestBody MarcaDTO marca){
        return marcaService.insert(marca);
    }

    @PutMapping("update/{id}")
    public MarcaDTO update(@PathVariable UUID id, @RequestBody MarcaDTO marca){
        return marcaService.update(id, marca);
    }
    @DeleteMapping("delete/{id}")
    public MarcaDTO delete(@PathVariable UUID id){
        return marcaService.delete(id);
    }

    @GetMapping("getbyid/{id}")
    public MarcaDTO getById(@PathVariable UUID id){
        return marcaService.getById(id);
    }

    @GetMapping
    public List<MarcaDTO> getAll(){
        return marcaService.getAll();
    }
}

