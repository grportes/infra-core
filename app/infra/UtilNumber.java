package infra;

import java.math.BigDecimal;

public final class UtilNumber {

    public static BigDecimal somar(
        final BigDecimal valueA,
        final BigDecimal valueB
    ) {

        return valueA != null && valueB != null ? valueA.add(valueB) : null;
    }

}
