package cl.gdl.ms_rol.errors;

public class BaseServiceException extends RuntimeException {
    public BaseServiceException(String message) {
        super(message);
    }
}
