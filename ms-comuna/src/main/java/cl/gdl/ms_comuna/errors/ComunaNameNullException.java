package cl.gdl.ms_comuna.errors;

public class ComunaNameNullException extends BaseServiceException{
    public ComunaNameNullException(String fieldName) {
        super("El campo '" + fieldName + "' no debe ser nulo.");
    }
}
