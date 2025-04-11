package cl.gdl.ms_region.errors;

public class BaseServiceException extends RuntimeException{
    public BaseServiceException(String message) {
        super(message);
    }
}
