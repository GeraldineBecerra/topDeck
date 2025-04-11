package cl.gdl.ms_idioma.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gdl.ms_idioma.dto.IdiomaDTO;
import cl.gdl.ms_idioma.errors.DuplicatedNameException;
import cl.gdl.ms_idioma.errors.IdiomaNameNullException;
import cl.gdl.ms_idioma.errors.NotFoundException;
import cl.gdl.ms_idioma.errors.NoDataException;
import cl.gdl.ms_idioma.repository.IIdiomaRepository;
import cl.gdl.ms_idioma.service.IIdiomaService;

@Service
public class IdiomaService  implements IIdiomaService{
 
    @Autowired
    IIdiomaRepository idiomaRepository;

    @Override
    public IdiomaDTO insert(IdiomaDTO idioma) {
        checkNameIdiomaNotNullOrEmpty(idioma.getNameIdioma());

        checkIdiomaNameNotExists(idioma.getNameIdioma());

        return idiomaRepository.save(idioma);
    }

    @Override
    public IdiomaDTO update(UUID id, IdiomaDTO idioma) {
        checkIdiomaExists(id);

        checkNameIdiomaNotNullOrEmpty(idioma.getNameIdioma());

        checkIdiomaNameNotExists(idioma.getNameIdioma());

        idioma.setIdIdioma(id);
        return idiomaRepository.save(idioma);
    }

     @Override
    public IdiomaDTO delete(UUID id) {
        checkIdiomaExists(id);

        idiomaRepository.deleteById(id);
        return null;
    }

    @Override
    public IdiomaDTO getById(UUID id) {
        checkIdiomaExists(id);
        return idiomaRepository.findById(id).get();
    }

    @Override
    public List<IdiomaDTO> getAll() {
       List<IdiomaDTO> categorias = (List<IdiomaDTO>) idiomaRepository.findAll();
        if (categorias.isEmpty()) {
            throw new NoDataException();
        }
        return categorias;
    }

    private void checkIdiomaNameNotExists(String nameIdioma) {
        idiomaRepository.findByNameIdiomaIgnoreCase(
                nameIdioma)
                .ifPresent(existingCategoria -> {
                    throw new DuplicatedNameException(nameIdioma);
                });
    }

    private void checkNameIdiomaNotNullOrEmpty(String nameIdioma) {
        if (nameIdioma == null || nameIdioma.trim().isEmpty()) {
            throw new IdiomaNameNullException("nameIdioma");
        }
    }

    private IdiomaDTO checkIdiomaExists(UUID id) {
        return idiomaRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("La categoria con el ID: " + id + " no existe"));
    }

}
