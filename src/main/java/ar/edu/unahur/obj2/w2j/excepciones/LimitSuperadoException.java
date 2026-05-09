package ar.edu.unahur.obj2.w2j.excepciones;

public class LimitSuperadoException extends RuntimeException{
    public LimitSuperadoException(){}

    public LimitSuperadoException(String message){
        super(message);
    }

    public LimitSuperadoException(String message, Throwable cause){
        super(message, cause);
    }

    public LimitSuperadoException(Throwable cause){
        super(cause);
    }
}
