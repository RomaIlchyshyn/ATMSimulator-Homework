package tests.withdrawalTests;

import base.BaseTest;
import helpers.LoginHelper;
import helpers.TestData;
import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WithdrawWithNegativeAmountTest extends BaseTest {

    @Test(groups = "withdrawal")
    public void shouldNotWithdrawWithNegativeAmount() {
        LoginHelper.successfulLogin(atmService);
        BigDecimal balanceBefore = atmService.getUserBalance();
        boolean result = atmService.withdrawMoney(TestData.NEGATIVE_AMOUNT);
        BigDecimal balanceAfter = atmService.getUserBalance();
        assertThat(result).isFalse();
        assertThat(balanceAfter).isEqualByComparingTo(balanceBefore);

    }
}
