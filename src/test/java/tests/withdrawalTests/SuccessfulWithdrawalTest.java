package tests.withdrawalTests;

import base.BaseTest;
import helpers.LoginHelper;
import helpers.TestData;
import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SuccessfulWithdrawalTest extends BaseTest {

    @Test(groups = "withdrawal")
    public void shouldWithdrawMoney() {
        LoginHelper.successfulLogin(atmService);
        BigDecimal withdrawAmount = TestData.NORMAL_AMOUNT;
        BigDecimal balanceBefore = atmService.getUserBalance();
        boolean result = atmService.withdrawMoney(withdrawAmount);
        assertThat(result).isTrue();
        assertThat(balanceBefore.subtract(withdrawAmount)).isEqualTo(atmService.getUserBalance());
    }
}
