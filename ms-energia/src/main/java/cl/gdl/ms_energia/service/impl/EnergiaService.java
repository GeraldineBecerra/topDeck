package cl.gdl.ms_energia.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gdl.ms_energia.dto.EnergiaDTO;
import cl.gdl.ms_energia.repository.IEnergiaRepository;
import cl.gdl.ms_energia.service.IEnergiaService;

@Service
public class EnergiaService implements IEnergiaService{

    @Autowired
    IEnergiaRepository energiaRepository;

    @Override
    public EnergiaDTO insert(EnergiaDTO energia) {
        return energiaRepository.save(energia);
    }

    @Override
    public EnergiaDTO update(UUID id, EnergiaDTO energia) {
        return energiaRepository.save(energia);
    }

    @Override
    public EnergiaDTO delete(UUID idEnergia) {
        energiaRepository.deleteById(idEnergia);
        return null;
    }

    @Override
    public EnergiaDTO getById(UUID idEnergia) {
        return energiaRepository.findById(idEnergia).get();
    }

    @Override
    public List<EnergiaDTO> getAll() {
        return (List<EnergiaDTO>) energiaRepository.findAll();
    }

}
