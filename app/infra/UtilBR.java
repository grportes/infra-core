package infra;

import br.com.caelum.stella.format.Formatter;
import br.com.caelum.stella.format.NITFormatter;

import static java.util.Objects.isNull;


public final class UtilBR {

    public static String formatCPF(final Long value) {
        if (isNull(value) ) return null;
        Formatter formatter = new NITFormatter();
        String unfotmatedValue = value.toString();
        return formatter.format(unfotmatedValue);
    }
}
