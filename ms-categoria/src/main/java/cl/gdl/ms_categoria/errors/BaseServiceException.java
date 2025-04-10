package cl.gdl.ms_categoria.errors;

public class BaseServiceException extends RuntimeException {
    public BaseServiceException(String message) {
        super(message);
    }
}
