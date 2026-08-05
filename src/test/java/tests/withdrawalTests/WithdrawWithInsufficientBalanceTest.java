package tests.withdrawalTests;

import base.BaseTest;
import helpers.LoginHelper;
import helpers.TestData;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WithdrawWithInsufficientBalanceTest extends BaseTest {
    @Test(groups = "withdrawal")
    public void shouldNotWithdrawMoney() {
        LoginHelper.successfulLogin(atmService);
        boolean result = atmService.withdrawMoney(TestData.LARGE_AMOUNT);
        assertThat(result).isFalse();
    }
}
