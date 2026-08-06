package dataproviders;

import org.testng.annotations.DataProvider;

import java.math.BigDecimal;
import java.util.List;

public class DepositAmountProvider {

    @DataProvider(name = "depositAmounts")
    public static Object[][] depositAmounts() {

        List<Object[]> data = List.of(
                new Object[]{BigDecimal.ONE, true},
                new Object[]{BigDecimal.ZERO, false},
                new Object[]{new BigDecimal("-100"), false}
        );
        return data.toArray(new Object[0][]);
    }
}