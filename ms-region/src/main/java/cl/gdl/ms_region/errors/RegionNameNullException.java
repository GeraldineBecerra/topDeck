package cl.gdl.ms_region.errors;

public class RegionNameNullException extends BaseServiceException{
    public RegionNameNullException(String fieldName) {
        super("El campo '" + fieldName + "' no debe ser nulo.");
    }

}
