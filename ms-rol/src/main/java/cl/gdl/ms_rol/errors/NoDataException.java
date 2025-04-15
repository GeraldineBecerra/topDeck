package cl.gdl.ms_rol.errors;

public class NoDataException  extends BaseServiceException{
    public NoDataException() {
        super("No existen datos.");
    }
}
