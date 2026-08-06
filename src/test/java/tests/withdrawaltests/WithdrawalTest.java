package tests.withdrawaltests;

import base.BaseTest;
import dataproviders.WithdrawAmountProvider;
import helpers.LoginHelper;
import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WithdrawalTest extends BaseTest {
    @Test(dataProvider = "withdrawAmount", dataProviderClass = WithdrawAmountProvider.class)
    public void withdrawTest(BigDecimal amount, boolean expected) {
        LoginHelper.successfulLogin(atmService);
        BigDecimal balanceBefore = atmService.getUserBalance();
        boolean result = atmService.withdrawMoney(amount);
        BigDecimal balanceAfter = atmService.getUserBalance();
        if (expected) {
            assertThat(balanceAfter).isEqualByComparingTo(balanceBefore.subtract(amount));
            assertThat(result).isTrue();
        } else {
            assertThat(balanceAfter).isEqualByComparingTo(balanceBefore);
            assertThat(result).isFalse();
        }
    }
}
