package dataProviders;

import base.BaseTest;
import helpers.TestData;
import org.testng.annotations.DataProvider;

public class DepositAmountProvider extends BaseTest {
    @DataProvider(name = "depositAmounts")
    public Object[][] amounts() {
        return new Object[][]{
                {TestData.SMALL_AMOUNT},
                {TestData.NORMAL_AMOUNT},
                {TestData.LARGE_AMOUNT}
        };
    }
}
