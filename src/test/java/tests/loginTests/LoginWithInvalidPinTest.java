package tests.loginTests;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LoginWithInvalidPinTest extends BaseTest {
    @Test(groups = "login")
    public void loginWithInvalidTest() {
        boolean result = atmService.login("4512",1235);
        assertThat(result).isEqualTo(false);
    }

}
