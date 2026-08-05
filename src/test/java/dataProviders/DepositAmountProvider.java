package dataProviders;

import base.BaseTest;
import helpers.TestData;
import org.testng.annotations.DataProvider;

public class DepositAmountProvider extends BaseTest {
    @DataProvider(name = "depositAmounts")
    public Object[][] amounts() {
        return new Object[][]{
                {TestData.SMALL_AMOUNT, true},
                {TestData.NORMAL_AMOUNT, true},
                {TestData.LARGE_AMOUNT, true},
                {TestData.NEGATIVE_AMOUNT, false},
                {TestData.ZERO_AMOUNT, false}
        };
    }
}
