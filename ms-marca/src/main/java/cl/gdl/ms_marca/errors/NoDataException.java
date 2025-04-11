package cl.gdl.ms_marca.errors;

public class NoDataException extends BaseServiceException{
    public NoDataException() {
        super("No existen datos.");
    }
}