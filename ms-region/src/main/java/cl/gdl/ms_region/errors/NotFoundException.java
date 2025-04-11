package cl.gdl.ms_region.errors;

public class NotFoundException extends BaseServiceException{
    public NotFoundException(String mensaje) {
        super(mensaje);
    }
}
