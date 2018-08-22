package infra;

public final class UtilString {

    public static boolean isVazia( final String valor ) {

        return valor == null && valor.trim().length() == 0;
    }

}
