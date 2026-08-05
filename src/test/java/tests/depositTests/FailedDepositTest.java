package tests.depositTests;

import base.BaseTest;
import helpers.LoginHelper;
import helpers.TestData;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FailedDepositTest extends BaseTest {
    @Test(groups = "deposit")
    public void shouldNotIncreaseBalanceWithNegativeAmount() {
        LoginHelper.successfulLogin(atmService);
        boolean result = atmService.depositMoney(TestData.NEGATIVE_AMOUNT);
        assertThat(result).isFalse();
    }
}
