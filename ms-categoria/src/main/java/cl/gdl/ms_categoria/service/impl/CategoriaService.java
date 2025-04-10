package cl.gdl.ms_categoria.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.gdl.ms_categoria.dto.CategoriaDTO;
import cl.gdl.ms_categoria.repository.ICategoriaRepository;
import cl.gdl.ms_categoria.service.ICategoriaService;
@Service
public class CategoriaService implements ICategoriaService{

    @Autowired
    ICategoriaRepository categoriaRepository;

    @Override
    public CategoriaDTO insert(CategoriaDTO categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public CategoriaDTO update(UUID id, CategoriaDTO categoria) {
        categoria.setIdCategoria(id);
        return categoriaRepository.save(categoria);
    }

    @Override
    public CategoriaDTO delete(UUID id) {
        categoriaRepository.deleteById(id);
        return null;
    }

    @Override
    public CategoriaDTO getById(UUID id) {
        return categoriaRepository.findById(id).get();
    }

    @Override
    public List<CategoriaDTO> getAll() {
        return (List<CategoriaDTO>) categoriaRepository.findAll();
    }

}
