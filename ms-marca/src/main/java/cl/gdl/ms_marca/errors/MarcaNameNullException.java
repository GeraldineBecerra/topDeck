package cl.gdl.ms_marca.errors;

public class MarcaNameNullException extends BaseServiceException{
    public MarcaNameNullException(String fieldName) {
        super("El campo '" + fieldName + "' no debe ser nulo.");
    }

}
