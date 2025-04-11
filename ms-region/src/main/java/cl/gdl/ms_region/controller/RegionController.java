package cl.gdl.ms_region.controller;

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

import cl.gdl.ms_region.dto.RegionDTO;
import cl.gdl.ms_region.service.IRegionService;

@RestController
@RequestMapping("/api/region")
public class RegionController {

    @Autowired
    IRegionService regioniService;

    @PostMapping("/insert")
    public RegionDTO insert(@RequestBody RegionDTO region){
        return regioniService.insert(region);
    }

    @PutMapping("update/{idRegion}")
    public RegionDTO update(@PathVariable UUID idRegion, @RequestBody RegionDTO region){
        return regioniService.update(idRegion, region);
    }

    @DeleteMapping("delete/{idRegion}")
    public RegionDTO delete(@PathVariable UUID idRegion){
        return regioniService.delete(idRegion);
    }

    @GetMapping("getbyid/{idRegion}")
    public RegionDTO getById(@PathVariable UUID idRegion){
        return regioniService.getById(idRegion);
    }

    @GetMapping
    public List<RegionDTO> getAll(){
        return regioniService.getAll();
    }

}
