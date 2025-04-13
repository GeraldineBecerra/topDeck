package cl.gdl.ms_comuna.dto;

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
@Table(name = "COMUNA")
public class ComunaDTO {

    @Id
    @GeneratedValue
    @Column(name = "ID_COMUNA")
    private UUID idComuna;
    
    @Column(name = "COMUNA")
    private String nameComuna;
}
