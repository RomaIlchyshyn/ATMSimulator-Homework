package tests;

import base.BaseTest;
import helpers.SuccessfulLogin;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LogoutTest extends BaseTest {
    SuccessfulLogin login = new SuccessfulLogin();
    @Test(groups = "logout")
    public void logoutTest() {
        login.successfulLogin(atmService);
        atmService.logout();
        assertThat(account).isNull();
    }
}
