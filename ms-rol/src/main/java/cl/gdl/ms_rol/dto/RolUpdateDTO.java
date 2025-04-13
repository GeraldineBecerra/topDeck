package cl.gdl.ms_rol.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RolUpdateDTO {
    
    private String nameRol;
    private String descripcion;
}
