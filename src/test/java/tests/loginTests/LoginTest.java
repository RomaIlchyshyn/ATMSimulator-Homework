package tests.loginTests;

import base.BaseTest;
import dataProviders.LoginDataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LoginTest extends BaseTest {
    @Test(groups = "login", dataProvider = "credentials", dataProviderClass = LoginDataProvider.class)
    public void loginTest(String card, int pin, boolean expected) {
        boolean result = atmService.login(card, pin);
        assertThat(result).isEqualTo(expected);
    }
}
