package dataProviders;

import base.BaseTest;
import helpers.TestData;
import org.testng.annotations.DataProvider;

public class DepositAmountProvider extends BaseTest {
    @DataProvider(name = "depositAmounts")
    public Object[][] amounts() {
        return new Object[][]{
                {TestData.generateRandomPositiveDepositAmount(atmService)},
                {TestData.generateRandomPositiveDepositAmount(atmService)},
                {TestData.generateRandomPositiveDepositAmount(atmService)}
        };
    }
}
