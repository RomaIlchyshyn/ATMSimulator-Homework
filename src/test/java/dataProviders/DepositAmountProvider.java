package dataProviders;

import org.testng.annotations.DataProvider;

public class DepositAmountProvider {
    @DataProvider(name = "depositAmounts")
    public Object[][] amounts() {
        return new Object[][]{
                {100},
                {250},
                {500}
        };
    }
}
