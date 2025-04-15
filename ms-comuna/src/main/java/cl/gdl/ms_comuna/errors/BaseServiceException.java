package cl.gdl.ms_comuna.errors;

public class BaseServiceException extends RuntimeException {
    public BaseServiceException(String message) {
        super(message);
    }
}
