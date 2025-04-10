package cl.gdl.ms_categoria.errors;

public class NoDataException  extends BaseServiceException{
    public NoDataException() {
        super("No existen datos.");
    }
}
