package helpers;

import java.math.BigDecimal;

public class TestData {
    public static BigDecimal amount(int amount) {
        return BigDecimal.valueOf(amount);
    }

    public static BigDecimal amount(double amount) {
        return BigDecimal.valueOf(amount);
    }
}
