package cl.gdl.ms_condicion.dto;

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
@Table(name = "CONDICION")
public class CondicionDTO {

    @Id
    @GeneratedValue(strategy=GenerationType.UUID)

    @Column(name = "ID_CONDICION")
    private UUID idCondicion;
    
    @Column(name = "CONDICION")
    private String nameCondicion;
}
