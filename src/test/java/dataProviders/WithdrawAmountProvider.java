package dataProviders;

import helpers.TestData;
import org.testng.annotations.DataProvider;

public class WithdrawAmountProvider {
    @DataProvider(name = "withdrawAmount")
    public static Object [][] withdrawAmount() {
        return new Object[][] {
                {TestData.NORMAL_AMOUNT, true},
                {TestData.ZERO_AMOUNT, false},
                {TestData.LARGE_AMOUNT, false},
                {TestData.NEGATIVE_AMOUNT, false}
        };
    }
}