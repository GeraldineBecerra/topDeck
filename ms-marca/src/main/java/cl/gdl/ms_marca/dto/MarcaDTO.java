package cl.gdl.ms_marca.dto;

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
@Table(name = "MARCA")
public class MarcaDTO {
    @Id
    @GeneratedValue
    @Column(name = "ID_MARCA")
    private UUID idMarca;

    @Column(name = "MARCA")
    private String nameMarca;

}
