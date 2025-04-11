package cl.gdl.ms_comuna.errors;

public class NoDataException  extends BaseServiceException{
    public NoDataException() {
        super("No existen datos.");
    }
}
