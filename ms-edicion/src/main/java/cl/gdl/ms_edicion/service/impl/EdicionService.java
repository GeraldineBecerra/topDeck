package cl.gdl.ms_edicion.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gdl.ms_edicion.dto.EdicionDTO;
import cl.gdl.ms_edicion.repository.IEdicionRepository;
import cl.gdl.ms_edicion.service.IEdicionService;

@Service
public class EdicionService implements IEdicionService {
    @Autowired
    IEdicionRepository edicionRepository;

    @Override
    public EdicionDTO insert(EdicionDTO edicion) {

        return edicionRepository.save(edicion);
    }

    @Override
    public EdicionDTO update(UUID id, EdicionDTO edicion) {
        edicion.setIdEdicion(id);
        return edicionRepository.save(edicion);
    }

    @Override
    public EdicionDTO delete(UUID id) {
        edicionRepository.deleteById(id);
        return null;
    }

    @Override
    public EdicionDTO getById(UUID id) {
        return edicionRepository.findById(id).get();
    }

    @Override
    public List<EdicionDTO> getAll() {
        return (List<EdicionDTO>) edicionRepository.findAll();
    }

}
