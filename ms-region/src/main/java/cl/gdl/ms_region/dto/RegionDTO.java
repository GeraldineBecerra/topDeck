package cl.gdl.ms_region.dto;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
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
@Table(name = "REGION")
public class RegionDTO {

    @Id
    @GeneratedValue
    @Column(name = "ID_REGION")
    private UUID idRegion;
    
    @Column(name = "REGION")
    private String nameRegion;

}
