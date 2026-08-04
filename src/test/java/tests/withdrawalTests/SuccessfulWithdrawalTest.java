package tests.withdrawalTests;

import base.BaseTest;
import helpers.SuccessfulLogin;
import helpers.TestData;
import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SuccessfulWithdrawalTest extends BaseTest {
    SuccessfulLogin login = new SuccessfulLogin();
    @Test(groups = "withdrawal")
    public void withdrawMoneyTest() {
        login.successfulLogin(atmService);
        BigDecimal withdrawAmount = TestData.generateRandomWithdrawAmount(atmService);
        BigDecimal balanceBefore = atmService.getUserBalance();
        boolean result = atmService.withdrawMoney(withdrawAmount);
        assertThat(result).isTrue();
        assertThat(balanceBefore.subtract(withdrawAmount)).isEqualTo(atmService.getUserBalance());
    }
}
