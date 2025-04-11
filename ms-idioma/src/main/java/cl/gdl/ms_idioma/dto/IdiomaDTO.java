package cl.gdl.ms_idioma.dto;

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
@Table(name = "IDIOMA")
public class IdiomaDTO {

    @Id
    @GeneratedValue
    @Column(name = "ID_IDIOMA")
    private UUID idIdioma;
    
    @Column(name = "IDIOMA")
    private String nameIdioma;
}
