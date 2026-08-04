package tests.withdrawalTests;

import base.BaseTest;
import helpers.SuccessfulLogin;
import helpers.TestData;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WithdrawWithNegativeAmountTest extends BaseTest {

    SuccessfulLogin login = new SuccessfulLogin();
    @Test(groups = "withdrawal")
    public void withdrawalWithNegativeAmount() {
        login.successfulLogin(atmService);
        boolean result = atmService.withdrawMoney(TestData.amount(-100));
        assertThat(result).isFalse();

    }
}
