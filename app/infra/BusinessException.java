package infra;

public class BusinessException extends Exception {

    private static final long serialVersionUID = 1149241039409861914L;

    public BusinessException( final String msg ) {

        super(msg);
    }

    public BusinessException(
        final String msg,
        final Throwable cause
    ){

        super(msg, cause);
    }
}
