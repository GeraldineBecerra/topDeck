package cl.gdl.ms_region.errors;

public class NoDataException extends BaseServiceException{
    public NoDataException() {
        super("No existen datos.");
    }
}
