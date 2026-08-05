package tests.loginTests;

import base.BaseTest;
import helpers.TestData;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LoginWithInvalidCardTest extends BaseTest {
    @Test(groups = "login")
    public void shouldNotLoginWithInvalidCard() {
        boolean result = atmService.login(TestData.INVALID_CARD, TestData.FIRST_CARD_VALID_PIN);
        assertThat(result).isFalse();
    }
}
