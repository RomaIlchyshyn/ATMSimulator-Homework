package tests.loginTests;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LoginWithInvalidCardTest extends BaseTest {
    @Test(groups = "login")
    public void loginWithInvalidCard() {
        boolean result = atmService.login("7777", 2341);
        assertThat(result).isEqualTo(false);
    }
}
