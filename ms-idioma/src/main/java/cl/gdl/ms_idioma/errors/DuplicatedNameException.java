package cl.gdl.ms_idioma.errors;

public class DuplicatedNameException extends BaseServiceException {
 public DuplicatedNameException(String name) {
        super("Ya existe un idioma con el nombre: " + name);
    }
}
