package cl.gdl.ms_rol.errors;

public class RolNameNullException extends BaseServiceException{
    public RolNameNullException(String fieldName) {
        super("El campo '" + fieldName + "' no debe ser nulo.");
    }
}
