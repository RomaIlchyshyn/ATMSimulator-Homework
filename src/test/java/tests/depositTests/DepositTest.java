package tests.depositTests;

import base.BaseTest;
import dataProviders.DepositAmountProvider;
import helpers.LoginHelper;
import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DepositTest extends BaseTest {
    @Test(dataProvider = "depositAmounts", dataProviderClass = DepositAmountProvider.class)
    public void depositTest(BigDecimal amount, boolean expected) {
        LoginHelper.successfulLogin(atmService);
        BigDecimal balanceBefore = atmService.getUserBalance();
        boolean result = atmService.depositMoney(amount);
        assertThat(result).isEqualTo(expected);
        BigDecimal balanceAfter = atmService.getUserBalance();
        if (expected) {
            assertThat(balanceAfter).isEqualByComparingTo(balanceBefore.add(amount));
        } else {
            assertThat(balanceAfter).isEqualByComparingTo(balanceBefore);
        }
    }
}
