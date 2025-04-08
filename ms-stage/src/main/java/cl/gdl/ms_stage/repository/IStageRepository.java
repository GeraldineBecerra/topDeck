package cl.gdl.ms_stage.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.gdl.ms_stage.dto.StageDTO;

@Repository
public interface IStageRepository extends CrudRepository<StageDTO, Integer> {

}
