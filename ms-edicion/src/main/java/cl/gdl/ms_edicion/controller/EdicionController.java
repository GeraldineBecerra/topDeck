package cl.gdl.ms_edicion.controller;

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

import cl.gdl.ms_edicion.dto.EdicionDTO;
import cl.gdl.ms_edicion.service.IEdicionService;

@RestController
@RequestMapping("/api/edicion")
public class EdicionController {

    @Autowired
    IEdicionService edicionService;

    @PostMapping("/insert")
    public EdicionDTO insert(@RequestBody EdicionDTO edicion) {
        return edicionService.insert(edicion);
    }

    @PutMapping("/update/{id}")
    public EdicionDTO update(@PathVariable UUID id,@RequestBody EdicionDTO edicion) {
        return edicionService.update(id,edicion);
    }

    @DeleteMapping("/delete/{id}")
    public EdicionDTO delete(@PathVariable UUID id){
        return edicionService.delete(id);
    }

    @GetMapping("/getById/{id}")
    public EdicionDTO getById(@PathVariable UUID id){
        return edicionService.getById(id);
    }

    @GetMapping
    public List<EdicionDTO> getAll(){
        return edicionService.getAll();
    }


}
