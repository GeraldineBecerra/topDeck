package cl.gdl.ms_idioma.errors;

public class IdiomaNameNullException extends BaseServiceException{
    public IdiomaNameNullException(String fieldName) {
        super("El campo '" + fieldName + "' no debe ser nulo.");
    }
}
