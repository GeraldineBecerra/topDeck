package cl.gdl.ms_comuna.errors;

public class DuplicatedNameException extends BaseServiceException {
 public DuplicatedNameException(String name) {
        super("Ya existe una comuna con el nombre: " + name);
    }
}
