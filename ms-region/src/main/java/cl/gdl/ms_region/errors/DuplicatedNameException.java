package cl.gdl.ms_region.errors;

public class DuplicatedNameException extends BaseServiceException{
    public DuplicatedNameException(String nameRegion) {
        super("Ya existe una region con el nombre: " + nameRegion);
    }

}
