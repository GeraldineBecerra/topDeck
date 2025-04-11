package cl.gdl.ms_idioma.errors;

public class NotFoundException extends BaseServiceException {
    public NotFoundException(String mensaje) {
        super(mensaje);
    }
}
