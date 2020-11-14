package infra;

import org.apache.commons.lang3.StringUtils;

import java.util.StringJoiner;

import static java.util.Objects.isNull;
import static org.apache.commons.lang3.StringUtils.defaultIfBlank;

public final class UtilString {

    private static final String MSG_VAZIA = "String não pode ser vazia";

    private UtilString() {
        throw new AssertionError("Não é permitido criar instâncias de UtilString");
    }

    public static String requiredNotBlank(
        final CharSequence str,
        final String message
    ) {
        if ( StringUtils.isBlank(str) )
            throw new IllegalArgumentException(defaultIfBlank(message,MSG_VAZIA));
        return str.toString();
    }

    public static StringJoiner requiredNotBlank(
        final StringJoiner str,
        final String message
    ) {
        if ( isBlank(str) )
            throw new IllegalArgumentException(defaultIfBlank(message,MSG_VAZIA));
        return str;
    }

    public static boolean isBlank( final StringJoiner str ) {
        return isNull( str ) || StringUtils.isBlank( str.toString() );
    }

}
