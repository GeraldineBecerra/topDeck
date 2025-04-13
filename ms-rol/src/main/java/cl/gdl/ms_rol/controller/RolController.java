package cl.gdl.ms_rol.controller;

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

import cl.gdl.ms_rol.dto.RolDTO;
import cl.gdl.ms_rol.service.IRolService;

@RestController
@RequestMapping("/api/rol")
public class RolController {

    @Autowired
    IRolService rolService;

    @PostMapping("/insert")
    public RolDTO insert(@RequestBody RolDTO rol){
        return rolService.insert(rol);
    }
    
    @PutMapping("update/{id}")
    public RolDTO update(@PathVariable UUID id, @RequestBody RolDTO rol){
        return rolService.update(id, rol);
    }

    @DeleteMapping("delete/{id}")
    public RolDTO delete(@PathVariable UUID id){
        return rolService.delete(id);
    }

    @GetMapping("getbyid/{id}")
    public RolDTO getById(@PathVariable UUID id){
        return rolService.getById(id);
    }

    @GetMapping
    public List<RolDTO> getAll(){
        return rolService.getAll();
    }

}
