package cl.gdl.ms_energia.controller;

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

import cl.gdl.ms_energia.dto.EnergiaDTO;
import cl.gdl.ms_energia.service.IEnergiaService;

@RestController
@RequestMapping("/api/energia")
public class EnergiaController {

    @Autowired
    IEnergiaService energiaService;

    @PostMapping("/insert")
    public EnergiaDTO insert(@RequestBody EnergiaDTO energia){
        return energiaService.insert(energia);
    }

    @PutMapping("/update/{idEnergia}")
    public EnergiaDTO update(@PathVariable UUID idEnergia, @RequestBody EnergiaDTO energia){
        return energiaService.update(idEnergia,energia);
    }

    @DeleteMapping("/delete/{idEnergia}")
    public EnergiaDTO delete(@PathVariable UUID idEnergia){
        return energiaService.delete(idEnergia);
    }

    @GetMapping("/getbyid/{idEnergia}")
    public EnergiaDTO getById(@PathVariable UUID idEnergia){
        return energiaService.getById(idEnergia);
    }

    @GetMapping
    public List<EnergiaDTO> getAll(){
        return energiaService.getAll();
    }

}
