package cl.gdl.ms_categoria.service;

import java.util.List;
import java.util.UUID;

import cl.gdl.ms_categoria.dto.CategoriaDTO;

public interface ICategoriaService {

    CategoriaDTO insert(CategoriaDTO categoria);

    CategoriaDTO update(UUID id, CategoriaDTO categoria);

    CategoriaDTO delete(UUID id);

    CategoriaDTO getById(UUID id);

    List<CategoriaDTO> getAll();

}
