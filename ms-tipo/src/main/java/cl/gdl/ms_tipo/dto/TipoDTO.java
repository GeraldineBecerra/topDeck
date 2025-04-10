package cl.gdl.ms_tipo.dto;

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
@Table(name="TIPO")

public class TipoDTO {

    @Id
    @GeneratedValue(strategy=GenerationType.UUID)

    @Column(name = "ID_TIPO")
    private UUID idTipo;
    
    @Column(name = "TIPO")
    private String nameTipo;

}
