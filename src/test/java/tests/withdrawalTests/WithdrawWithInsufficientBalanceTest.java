package tests.withdrawalTests;

import base.BaseTest;
import helpers.SuccessfulLogin;
import helpers.TestData;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WithdrawWithInsufficientBalanceTest extends BaseTest {
    SuccessfulLogin login = new SuccessfulLogin();
    @Test(groups = "withdrawal")
    public void withdrawWithInsufficientBalanceTest() {
        login.successfulLogin(atmService);
        boolean result = atmService.withdrawMoney(TestData.amount(1000));
        assertThat(result).isFalse();
    }
}
