package cl.gdl.ms_idioma.controller;

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

import cl.gdl.ms_idioma.dto.IdiomaDTO;
import cl.gdl.ms_idioma.service.IIdiomaService;

@RestController
@RequestMapping("/api/idioma")
public class IdiomaController {
    @Autowired
    IIdiomaService idiomaService;

    @PostMapping("/insert")
    public IdiomaDTO insert(@RequestBody IdiomaDTO idioma) {
        return idiomaService.insert(idioma);
    }
    
    @PutMapping("update/{id}")
    public IdiomaDTO update(@PathVariable UUID id, @RequestBody IdiomaDTO idioma){
        return idiomaService.update(id, idioma);
    }

    @DeleteMapping("delete/{id}")
    public IdiomaDTO delete(@PathVariable UUID id){
        return idiomaService.delete(id);
    }

    @GetMapping("getbyid/{id}")
    public IdiomaDTO getById(@PathVariable UUID id){
        return idiomaService.getById(id);
    }

    @GetMapping
    public List<IdiomaDTO> getAll(){
        return idiomaService.getAll();
    }
}
