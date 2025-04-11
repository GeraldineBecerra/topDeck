package cl.gdl.ms_region.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gdl.ms_region.dto.RegionDTO;
import cl.gdl.ms_region.errors.DuplicatedNameException;
import cl.gdl.ms_region.errors.NoDataException;
import cl.gdl.ms_region.errors.NotFoundException;
import cl.gdl.ms_region.errors.RegionNameNullException;
import cl.gdl.ms_region.repository.IRegionRepository;
import cl.gdl.ms_region.service.IRegionService;

@Service
public class RegionService implements IRegionService{

    @Autowired
    IRegionRepository regionRepository;

    @Override
    public RegionDTO insert(RegionDTO region) {
        checkNameRegionNotNullOrEmpty(region.getNameRegion());

        checkRegionNameNotExists(region.getNameRegion());

        return regionRepository.save(region);
    }

    @Override
    public RegionDTO update(UUID idRegion, RegionDTO region) {
        checkRegionExists(idRegion);

        checkNameRegionNotNullOrEmpty(region.getNameRegion());

        checkRegionNameNotExists(region.getNameRegion());

        region.setIdRegion(idRegion);
        return regionRepository.save(region);
    }

    @Override
    public RegionDTO delete(UUID idRegion) {
        checkRegionExists(idRegion);

        regionRepository.deleteById(idRegion);
        return null;
    }

    @Override
    public RegionDTO getById(UUID idRegion) {
        checkRegionExists(idRegion);
        return regionRepository.findById(idRegion).get();
    }

    @Override
    public List<RegionDTO> getAll() {
        List<RegionDTO> regiones = (List<RegionDTO>) regionRepository.findAll();
        if (regiones.isEmpty()) {
            throw new NoDataException();
        }
        return regiones;
    }

        private void checkRegionNameNotExists(String nameRegion) {
            regionRepository.findByNameRegionIgnoreCase(nameRegion)
                .ifPresent(existingRegion -> {
                    throw new DuplicatedNameException(nameRegion);
                });
    }

    private void checkNameRegionNotNullOrEmpty(String nameRegion) {
        if (nameRegion == null || nameRegion.trim().isEmpty()) {
            throw new RegionNameNullException("nameRegion");
        }
    }

    private RegionDTO checkRegionExists(UUID idRegion) {
        return regionRepository.findById(idRegion)
                .orElseThrow(() -> new NotFoundException("La Region con el ID: " + idRegion + " no existe"));
    }

}
