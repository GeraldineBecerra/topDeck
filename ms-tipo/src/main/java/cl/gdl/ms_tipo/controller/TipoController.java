package cl.gdl.ms_tipo.controller;

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

import cl.gdl.ms_tipo.dto.TipoDTO;
import cl.gdl.ms_tipo.service.ITipoService;

@RestController
@RequestMapping("/api/tipo")

public class TipoController {

    @Autowired
    ITipoService tipoService;

    @PostMapping("/insert")
    public TipoDTO insert(@RequestBody TipoDTO tipo){
        return tipoService.insert(tipo);
    }

    @PutMapping("/update/{idTipo}")
    public TipoDTO update(@PathVariable UUID idTipo, @RequestBody TipoDTO tipo){
        return tipoService.update(idTipo,tipo);
    }

    @DeleteMapping("/delete/{idTipo}")
    public TipoDTO delete(@PathVariable UUID idTipo){
        return tipoService.delete(idTipo);
    }

    @GetMapping("/getbyid/{idTipo}")
    public TipoDTO getById(@PathVariable UUID idTipo){
        return tipoService.getById(idTipo);
    }

    @GetMapping
    public List<TipoDTO> getAll(){
        return tipoService.getAll();
    }

}
