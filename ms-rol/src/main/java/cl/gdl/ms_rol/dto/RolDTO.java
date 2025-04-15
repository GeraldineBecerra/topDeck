package cl.gdl.ms_rol.dto;

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
@Table(name = "ROL")
public class RolDTO {

    @Id
    @GeneratedValue
    @Column(name = "ID_ROL")
    private UUID idRol;
    
    @Column(name = "ROL")
    private String nameRol;

    private String descripcion;

}
