package SDA.Strategy;

import java.math.BigDecimal;

public class TaxEN implements TaxStrategy {
    @Override
    public BigDecimal calculateTax(BigDecimal moneyToTax) {
        return moneyToTax.multiply(new BigDecimal(0.10));
    }
}
