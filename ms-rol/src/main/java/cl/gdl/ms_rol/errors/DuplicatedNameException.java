package cl.gdl.ms_rol.errors;

public class DuplicatedNameException extends BaseServiceException {
 public DuplicatedNameException(String name) {
        super("Ya existe un Rol con el nombre: " + name);
    }
}
