package tests.depositTests;

import base.BaseTest;
import dataProviders.DepositAmountProvider;
import helpers.LoginHelper;
import helpers.TestData;
import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SuccessfulDepositTest extends BaseTest {

    @Test(dataProvider = "depositAmounts",
            dataProviderClass = DepositAmountProvider.class,
            groups = "deposit")
    public void shouldDepositMoneySuccessfully(BigDecimal amount) {
        LoginHelper.successfulLogin(atmService);
        BigDecimal balanceBefore = atmService.getUserBalance();
        atmService.depositMoney(amount);
        assertThat(atmService.getUserBalance()).isEqualByComparingTo(balanceBefore.add(amount));
    }

}
