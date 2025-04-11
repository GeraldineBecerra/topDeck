package cl.gdl.ms_energia.dto;

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
@Table(name="ENERGIA")

public class EnergiaDTO {

    @Id
    @GeneratedValue(strategy=GenerationType.UUID)

    @Column(name = "ID_ENERGIA")
    private UUID idEnergia;
    
    @Column(name = "ENERGIA")
    private String nameEnergia;

}
