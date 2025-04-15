package cl.gdl.ms_rol.errors;

public class NotFoundException extends BaseServiceException {
    public NotFoundException(String mensaje) {
        super(mensaje);
    }
}
