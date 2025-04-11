package cl.gdl.ms_rareza.dto;

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
@Table(name="RAREZA")
public class RarezaDTO {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)

    @Column(name = "ID_RAREZA")
    private UUID idRareza;

    @Column(name = "RAREZA")
    private String nameRareza;


}
