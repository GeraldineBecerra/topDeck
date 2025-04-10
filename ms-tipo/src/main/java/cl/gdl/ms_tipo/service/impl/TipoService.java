package cl.gdl.ms_tipo.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gdl.ms_tipo.dto.TipoDTO;
import cl.gdl.ms_tipo.repository.ITipoRepository;
import cl.gdl.ms_tipo.service.ITipoService;

@Service
public class TipoService implements ITipoService{

    @Autowired
    ITipoRepository tipoRepository;

    @Override
    public TipoDTO insert(TipoDTO tipo) {
        return tipoRepository.save(tipo);
    }

    @Override
    public TipoDTO update(UUID idTipo, TipoDTO tipo) {
        tipo.setIdTipo(idTipo);
        return tipoRepository.save(tipo);
    }

    @Override
    public TipoDTO delete(UUID idTipo) {
        tipoRepository.deleteById(idTipo);
        return null;
    }

    @Override
    public TipoDTO getById(UUID idTipo) {
        return tipoRepository.findById(idTipo).get();
    }

    @Override
    public List<TipoDTO> getAll() {
        return (List<TipoDTO>) tipoRepository.findAll();
    }

}
