package cl.gdl.ms_marca.errors;

public class NotFoundException extends BaseServiceException {
    public NotFoundException(String mensaje) {
        super(mensaje);
    }
}
