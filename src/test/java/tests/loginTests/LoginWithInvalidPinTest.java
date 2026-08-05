package tests.loginTests;

import base.BaseTest;
import helpers.TestData;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LoginWithInvalidPinTest extends BaseTest {
    @Test(groups = "login")
    public void shouldNotLoginWithInvalidPin() {
        boolean result = atmService.login(TestData.FIRST_VALID_CARD, TestData.INVALID_PIN);
        assertThat(result).isFalse();
    }

}
