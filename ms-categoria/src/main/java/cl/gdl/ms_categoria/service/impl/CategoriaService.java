package cl.gdl.ms_categoria.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gdl.ms_categoria.dto.CategoriaDTO;
import cl.gdl.ms_categoria.errors.CategoryNameNullException;
import cl.gdl.ms_categoria.errors.DuplicatedNameException;
import cl.gdl.ms_categoria.errors.NoDataException;
import cl.gdl.ms_categoria.errors.NotFoundException;
import cl.gdl.ms_categoria.repository.ICategoriaRepository;
import cl.gdl.ms_categoria.service.ICategoriaService;
@Service
public class CategoriaService implements ICategoriaService{

    @Autowired
    ICategoriaRepository categoriaRepository;

    @Override
    public CategoriaDTO insert(CategoriaDTO categoria) {
        checkNameCategoriaNotNullOrEmpty(categoria.getNameCategoria());

        checkCategoriaNameNotExists(categoria.getNameCategoria());

        return categoriaRepository.save(categoria);
    }

    @Override
    public CategoriaDTO update(UUID id, CategoriaDTO categoria) {
        checkCategoriaExists(id);

        checkNameCategoriaNotNullOrEmpty(categoria.getNameCategoria());

        checkCategoriaNameNotExists(categoria.getNameCategoria());

        categoria.setIdCategoria(id);
        return categoriaRepository.save(categoria);
    }

    @Override
    public CategoriaDTO delete(UUID id) {
        checkCategoriaExists(id);

        categoriaRepository.deleteById(id);
        return null;
    }

    @Override
    public CategoriaDTO getById(UUID id) {
        checkCategoriaExists(id);
        return categoriaRepository.findById(id).get();
    }

    @Override
    public List<CategoriaDTO> getAll() {
       List<CategoriaDTO> categorias = (List<CategoriaDTO>) categoriaRepository.findAll();
        if (categorias.isEmpty()) {
            throw new NoDataException();
        }
        return categorias;
    }

    private void checkCategoriaNameNotExists(String nameCategoria) {
        categoriaRepository.findByNameCategoriaIgnoreCase(nameCategoria)
                .ifPresent(existingCategoria -> {
                    throw new DuplicatedNameException(nameCategoria);
                });
    }

    private void checkNameCategoriaNotNullOrEmpty(String nameCategoria) {
        if (nameCategoria == null || nameCategoria.trim().isEmpty()) {
            throw new CategoryNameNullException("nameCategoria");
        }
    }

    private CategoriaDTO checkCategoriaExists(UUID id) {
        return categoriaRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("La categoria con el ID: " + id + " no existe"));
    }

}
