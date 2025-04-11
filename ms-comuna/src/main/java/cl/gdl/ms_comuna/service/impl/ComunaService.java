package cl.gdl.ms_comuna.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gdl.ms_comuna.dto.ComunaDTO;
import cl.gdl.ms_comuna.errors.ComunaNameNullException;
import cl.gdl.ms_comuna.errors.DuplicatedNameException;
import cl.gdl.ms_comuna.errors.NoDataException;
import cl.gdl.ms_comuna.errors.NotFoundException;
import cl.gdl.ms_comuna.repository.IComunaRepository;
import cl.gdl.ms_comuna.service.IComunaService;

@Service
public class ComunaService implements IComunaService {
    @Autowired
    IComunaRepository comunaRepository;

    @Override
    public ComunaDTO insert(ComunaDTO comuna) {

        checkNameComunaNotNullOrEmpty(comuna.getNameComuna());

        checkComunaNameNotExists(comuna.getNameComuna());

        return comunaRepository.save(comuna);
    }

    @Override
    public ComunaDTO update(UUID id, ComunaDTO comuna) {
        checkComunaExists(id);

        checkNameComunaNotNullOrEmpty(comuna.getNameComuna());

        checkComunaNameNotExists(comuna.getNameComuna());

        comuna.setIdComuna(id);
        return comunaRepository.save(comuna);
    }

    @Override
    public ComunaDTO delete(UUID id) {
        checkComunaExists(id);

        comunaRepository.deleteById(id);
        return null;
    }

    @Override
    public ComunaDTO getById(UUID id) {
        checkComunaExists(id);
        return comunaRepository.findById(id).get();
    }

    @Override
    public List<ComunaDTO> getAll() {
        List<ComunaDTO> categorias = (List<ComunaDTO>) comunaRepository.findAll();
        if (categorias.isEmpty()) {
            throw new NoDataException();
        }
        return categorias;
    }

    private void checkComunaNameNotExists(String nameComuna) {
        comunaRepository.findByNameComunaIgnoreCase(
                nameComuna)
                .ifPresent(existingCategoria -> {
                    throw new DuplicatedNameException(nameComuna);
                });
    }

    private void checkNameComunaNotNullOrEmpty(String nameComuna) {
        if (nameComuna == null || nameComuna.trim().isEmpty()) {
            throw new ComunaNameNullException("nameComuna");
        }
    }

    private ComunaDTO checkComunaExists(UUID id) {
        return comunaRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("La categoria con el ID: " + id + " no existe"));
    }
}
