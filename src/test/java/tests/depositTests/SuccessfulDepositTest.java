package tests.depositTests;

import base.BaseTest;
import dataProviders.DepositAmountProvider;
import helpers.SuccessfulLogin;
import helpers.TestData;
import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SuccessfulDepositTest extends BaseTest {
    SuccessfulLogin login = new SuccessfulLogin();

    @Test(dataProvider = "depositAmounts",
            dataProviderClass = DepositAmountProvider.class,
            groups = "deposit")
    public void successfulDepTest(int amount) {
        login.successfulLogin(atmService);
        BigDecimal balanceBefore = atmService.getUserBalance();
        atmService.depositMoney(TestData.amount(amount));
        assertThat(atmService.getUserBalance()).isEqualByComparingTo(balanceBefore.add(BigDecimal.valueOf(amount)));
    }

}
