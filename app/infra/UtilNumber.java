package infra;

import java.math.BigDecimal;

public final class UtilNumber {

    private UtilNumber() {
        throw new AssertionError("Não é permitido criar instâncias de UtilNumber");
    }

    public static BigDecimal somar(
        final BigDecimal valueA,
        final BigDecimal valueB
    ) {

        return valueA != null && valueB != null ? valueA.add(valueB) : null;
    }

}
