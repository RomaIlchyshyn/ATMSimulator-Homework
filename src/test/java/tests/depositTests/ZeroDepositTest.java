package tests.depositTests;

import base.BaseTest;
import helpers.SuccessfulLogin;
import helpers.TestData;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ZeroDepositTest extends BaseTest {
    SuccessfulLogin login = new SuccessfulLogin();

    @Test(groups = "deposit")
    public void zeroDepositTest() {
        login.successfulLogin(atmService);
        boolean result = atmService.depositMoney(TestData.amount(0));
        assertThat(result).isFalse();
    }
}
