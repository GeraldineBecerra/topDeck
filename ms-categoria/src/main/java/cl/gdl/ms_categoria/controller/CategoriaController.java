package cl.gdl.ms_categoria.controller;

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

import cl.gdl.ms_categoria.dto.CategoriaDTO;
import cl.gdl.ms_categoria.service.ICategoriaService;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {

    @Autowired
    ICategoriaService categoriaService;

    @PostMapping("/insert")
    public CategoriaDTO insert(@RequestBody CategoriaDTO categoria){
        return categoriaService.insert(categoria);
    }
    
    @PutMapping("update/{id}")
    public CategoriaDTO update(@PathVariable UUID id, @RequestBody CategoriaDTO categoria){
        return categoriaService.update(id, categoria);
    }

    @DeleteMapping("delete/{id}")
    public CategoriaDTO delete(@PathVariable UUID id){
        return categoriaService.delete(id);
    }

    @GetMapping("getbyid/{id}")
    public CategoriaDTO getById(@PathVariable UUID id){
        return categoriaService.getById(id);
    }

    @GetMapping
    public List<CategoriaDTO> getAll(){
        return categoriaService.getAll();
    }
}
