package tests.depositTests;

import base.BaseTest;
import helpers.LoginHelper;
import helpers.TestData;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ZeroDepositTest extends BaseTest {

    @Test(groups = "deposit")
    public void shouldNotIncreaseBalanceWithZeroAmount() {
        LoginHelper.successfulLogin(atmService);
        boolean result = atmService.depositMoney(TestData.ZERO_AMOUNT);
        assertThat(result).isFalse();
    }
}
