package cl.gdl.ms_stage.dto;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="STAGE")


public class StageDTO {
    
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)

    @Column(name = "ID_STAGE")
    private UUID idStage;
    
    @Column(name = "STAGE")
    private String nameStage;


}
