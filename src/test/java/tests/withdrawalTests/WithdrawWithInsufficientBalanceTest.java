package tests.withdrawalTests;

import base.BaseTest;
import helpers.LoginHelper;
import helpers.TestData;
import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WithdrawWithInsufficientBalanceTest extends BaseTest {
    @Test(groups = "withdrawal")
    public void shouldNotWithdrawMoney() {
        LoginHelper.successfulLogin(atmService);
        BigDecimal balanceBefore = atmService.getUserBalance();
        boolean result = atmService.withdrawMoney(TestData.LARGE_AMOUNT);
        BigDecimal balanceAfter = atmService.getUserBalance();
        assertThat(result).isFalse();
        assertThat(balanceAfter).isEqualByComparingTo(balanceBefore);
    }
}
