package tests.loginTests;

import base.BaseTest;
import helpers.TestData;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LoginWithInvalidCardTest extends BaseTest {
    @Test(groups = "login")
    public void loginWithInvalidCard() {
        boolean result = atmService.login(TestData.generateRandomCard(), 2341);
        assertThat(result).isEqualTo(false);
    }
}
