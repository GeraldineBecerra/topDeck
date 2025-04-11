package cl.gdl.ms_region.service;

import java.util.List;
import java.util.UUID;

import cl.gdl.ms_region.dto.RegionDTO;

public interface IRegionService {

    RegionDTO insert(RegionDTO region);

    RegionDTO update(UUID idRegion, RegionDTO region);

    RegionDTO delete(UUID idRegion);

    RegionDTO getById(UUID idRegion);

    List<RegionDTO> getAll();

}
