package cl.gdl.ms_marca.errors;

public class DuplicatedNameException extends BaseServiceException {
    public DuplicatedNameException(String name) {
           super("Ya existe una marca con el nombre: " + name);
       }
   }
   