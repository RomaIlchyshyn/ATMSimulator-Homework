package tests.withdrawalTests;

import base.BaseTest;
import helpers.LoginHelper;
import helpers.TestData;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WithdrawWithNegativeAmountTest extends BaseTest {

    @Test(groups = "withdrawal")
    public void shouldNotWithdrawWithNegativeAmount() {
        LoginHelper.successfulLogin(atmService);
        boolean result = atmService.withdrawMoney(TestData.NEGATIVE_AMOUNT);
        assertThat(result).isFalse();

    }
}
