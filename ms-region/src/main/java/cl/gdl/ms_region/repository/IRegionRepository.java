package cl.gdl.ms_region.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.gdl.ms_region.dto.RegionDTO;

@Repository
public interface IRegionRepository extends CrudRepository<RegionDTO, UUID>{

    RegionDTO findByNameRegion(String nameRegion);

    Optional<RegionDTO> findByNameRegionIgnoreCase(String nameRegion);

}
