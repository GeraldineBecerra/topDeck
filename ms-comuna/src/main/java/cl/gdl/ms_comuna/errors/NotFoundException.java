package cl.gdl.ms_comuna.errors;

public class NotFoundException extends BaseServiceException {
    public NotFoundException(String mensaje) {
        super(mensaje);
    }
}
