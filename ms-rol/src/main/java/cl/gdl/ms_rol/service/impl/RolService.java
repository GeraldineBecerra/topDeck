package cl.gdl.ms_rol.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gdl.ms_rol.dto.RolDTO;
import cl.gdl.ms_rol.dto.RolUpdateDTO;
import cl.gdl.ms_rol.errors.DuplicatedNameException;
import cl.gdl.ms_rol.errors.NoDataException;
import cl.gdl.ms_rol.errors.NotFoundException;
import cl.gdl.ms_rol.errors.RolNameNullException;
import cl.gdl.ms_rol.repository.IRolRepository;
import cl.gdl.ms_rol.service.IRolService;

@Service
public class RolService implements IRolService{

    @Autowired
    IRolRepository rolRepository;

    @Override
    public RolDTO insert(RolDTO rol) {
        checkNameRolNotNullOrEmpty(rol.getNameRol());

        checkRolNameNotExists(rol.getNameRol());

        return rolRepository.save(rol);
    }

    @Override
    public RolDTO update(UUID id, RolUpdateDTO categoria) {

        RolDTO IRol = rolRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Rol no encontrado"));

        checkNameRolNotNullOrEmpty(categoria.getNameRol());

        checkRolNameNotExists(categoria.getNameRol());

        return rolRepository.save(IRol);
    }

    @Override
    public RolDTO delete(UUID id) {
        checkRolExists(id);

        rolRepository.deleteById(id);
        return null;
    }

    @Override
    public RolDTO getById(UUID id) {
        checkRolExists(id);
        return rolRepository.findById(id).get();
    }

    @Override
    public List<RolDTO> getAll() {
       List<RolDTO> categorias = (List<RolDTO>) rolRepository.findAll();
        if (categorias.isEmpty()) {
            throw new NoDataException();
        }
        return categorias;
    }

    private void checkRolNameNotExists(String nameRol) {
        rolRepository.findByNameRolIgnoreCase(nameRol)
                .ifPresent(existingRol -> {
                    throw new DuplicatedNameException(nameRol);
                });
    }

    private void checkNameRolNotNullOrEmpty(String nameRol) {
        if (nameRol == null || nameRol.trim().isEmpty()) {
            throw new RolNameNullException("nameCategoria");
        }
    }

    private RolDTO checkRolExists(UUID id) {
        return rolRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("El Rol con el ID: " + id + " no existe"));
    }

}
