package cl.gdl.ms_rareza.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gdl.ms_rareza.dto.RarezaDTO;
import cl.gdl.ms_rareza.repository.IRarezaRepository;
import cl.gdl.ms_rareza.service.IRarezaService;

@Service
public class RarezaService implements IRarezaService{
    @Autowired
    IRarezaRepository rarezaRepository;

    @Override
    public RarezaDTO insert(RarezaDTO rareza) {

        return rarezaRepository.save(rareza);
    }

    @Override
    public RarezaDTO update(UUID id, RarezaDTO rareza) {
        rareza.setIdRareza(id);
        return rarezaRepository.save(rareza);
    }

    @Override
    public RarezaDTO delete(UUID id) {
        rarezaRepository.deleteById(id);
        return null;
    }

    @Override
    public RarezaDTO getById(UUID id) {
        return rarezaRepository.findById(id).get();
    }

    @Override
    public List<RarezaDTO> getAll() {
        return (List<RarezaDTO>) rarezaRepository.findAll();
    }

    


    


}
