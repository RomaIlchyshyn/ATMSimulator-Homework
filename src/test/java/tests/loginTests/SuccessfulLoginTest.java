package tests.loginTests;

import base.BaseTest;
import dataProviders.LoginDataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SuccessfulLoginTest extends BaseTest {

    @Test(groups = "login", dataProvider = "credentials", dataProviderClass = LoginDataProvider.class)
    public void successfulLoginTest(String card, int pinCode) {
        boolean result = atmService.login(card,pinCode);
        assertThat(result).isEqualTo(true);
    }
}
