package cl.gdl.ms_categoria.errors;

public class CategoryNameNullException extends BaseServiceException{
    public CategoryNameNullException(String fieldName) {
        super("El campo '" + fieldName + "' no debe ser nulo.");
    }
}
