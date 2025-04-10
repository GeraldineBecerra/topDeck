package cl.gdl.ms_condicion.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gdl.ms_condicion.dto.CondicionDTO;
import cl.gdl.ms_condicion.repository.ICondicionRepository;
import cl.gdl.ms_condicion.service.ICondicionService;

@Service
public class CondicionService implements ICondicionService  {

    @Autowired
    ICondicionRepository condicionRepository;

    @Override
    public CondicionDTO insert(CondicionDTO condicion) {
        
        return condicionRepository.save(condicion);
    }

    @Override
    public CondicionDTO update(UUID id, CondicionDTO condicion) {
        condicion.setIdCondicion(id);
        return condicionRepository.save(condicion);
    }

    @Override
    public CondicionDTO delete(UUID id) {
        condicionRepository.deleteById(id);
        return null;
    }

    @Override
    public CondicionDTO getById(UUID id) {
        return condicionRepository.findById(id).get();

    }

    @Override
    public List<CondicionDTO> getAll() {
        return (List<CondicionDTO>) condicionRepository.findAll();
    }

}
