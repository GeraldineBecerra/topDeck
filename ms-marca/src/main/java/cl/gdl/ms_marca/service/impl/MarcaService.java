package cl.gdl.ms_marca.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import cl.gdl.ms_marca.dto.MarcaDTO;
import cl.gdl.ms_marca.errors.DuplicatedNameException;
import cl.gdl.ms_marca.errors.MarcaNameNullException;
import cl.gdl.ms_marca.errors.NoDataException;
import cl.gdl.ms_marca.errors.NotFoundException;
import cl.gdl.ms_marca.repository.IMarcaRepository;
import cl.gdl.ms_marca.service.IMarcaService;

@Service
public class MarcaService implements IMarcaService {

    @Autowired
    IMarcaRepository marcaRepository;

    @Override
    public MarcaDTO insert(MarcaDTO marca) {
        checkNameMarcaNotNullOrEmpty(marca.getNameMarca());

        checkMarcaNameNotExists(marca.getNameMarca());

        return marcaRepository.save(marca);
    }

    @Override
    public MarcaDTO update(UUID id, MarcaDTO marca) {
        checkMarcaExists(id);

        checkNameMarcaNotNullOrEmpty(marca.getNameMarca());

        checkMarcaNameNotExists(marca.getNameMarca());

        marca.setIdMarca(id);
        return marcaRepository.save(marca);
    }

    @Override
    public MarcaDTO delete(UUID id) {
        checkMarcaExists(id);

        marcaRepository.deleteById(id);
        return null;
    }

    @Override
    public MarcaDTO getById(UUID id) {
        checkMarcaExists(id);
        return marcaRepository.findById(id).get();
    }

    @Override
    public List<MarcaDTO> getAll() {
       List<MarcaDTO> marca = (List<MarcaDTO>) marcaRepository.findAll();
        if (marca.isEmpty()) {
            throw new NoDataException();
        }
        return marca;
    }

    private void checkMarcaNameNotExists(String nameMarca) {
        marcaRepository.findByNameMarcaIgnoreCase(nameMarca)
                .ifPresent(existingMarca -> {
                    throw new DuplicatedNameException(nameMarca);
                });
    }

    private void checkNameMarcaNotNullOrEmpty(String nameMarca) {
        if (nameMarca == null || nameMarca.trim().isEmpty()) {
            throw new MarcaNameNullException("nameMarca");
        }
    }

    private MarcaDTO checkMarcaExists(UUID id) {
        return marcaRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("La marca con el ID: " + id + " no existe"));
    }







}

